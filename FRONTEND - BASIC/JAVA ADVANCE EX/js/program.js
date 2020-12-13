$(function() {
    $(".header").load("header.html");
    $(".main").load("main.html");
    $(".footer").load("footer.html");
});

function clickUsers() {
    $(".main").load("viewList.html");
    initGroup();
}

function clickhome() {
    $(".main").load("main.html");
}
var groups = [];
var counter = 0;

function Group(id, name) {
    this.id = ++counter;
    this.name = name;
    this.member = member;
    this.fullname = fullname;
    this.createDate = createDate;
}

function initGroup() {
    var url = "http://localhost:8080/api/v1/groups";

    //Call API from server

    $.get(url, function(data, status) {
        //error
        if (status == "error") {
            alert("Error when loading data");
            return;
        }
        groups = data.content;
        console.log(groups);
        filltoTable();
    });
}

function filltoTable() {

    $('tbody').empty();

    var body = "";
    //dung for de in ra thang index (STT) 
    for (let index = 0; index < groups.length; index++) {
        const item = groups[index];
        body += '<tr>' +
            '<td>' + '<form style="padding-left: 10px;"><input id="input' + index + '" type="checkbox" value=""> </form>' + '</td>' +
            '<td>' + (index + 1) + '</td>' +
            '<td onclick = "viewDetailGroup()" >' +   '<u>' + item.name + '</u>'  +  '</td>' +
            // '<td>' + '<a href= "../html/viewdetail.html">' + item.name + '</a>' + '</td>' +
            '<td>' + item.member + '</td>' +
            '<td>' + item.fullname + '</td>' +
            '<td>' + (item.createDate == null ? "" : item.createDate) + '</td>' +
            '</tr>';
    }

    $('tbody').append(body);
}


function openCreateModal() {
    resetForm();
    showModal();
}

function resetForm() {
    $("#id").val("");
    $("#name").val("");
}

// Modal name duoc dinh nghia o file ViewList
function hideModal() {
    $(".modal").modal('hide');
}

function showModal() {
    $(".modal").modal('show');
}

function SaveCreateGroup() {

    //lay data tu model ra
    var name = $("#name").val();

    //khai báo employee dưới dạng json
    var group = { name: name };
    console.log(name);

    $.ajax({
        url: 'http://localhost:8080/api/v1/groups',
        type: 'POST',
        data: JSON.stringify(group), // body
        contentType: "application/json", // type of body (json, xml, text)
        // dataType: 'json', // datatype return
        success: function(data, textStatus, xhr) {
            hideModal();
            //showSuccessAlert();
            initGroup();
        },
        error(jqXHR, textStatus, errorThrown) {
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    });
}

function viewDetailGroup() {
    $(".main").load("viewdetail.html");
    GetGroupById(id);
}
function GetGroupById(id) {
    var url = "http://localhost:8080/api/v1/groups" + id;

    //Call API from server

    $.get(url, function(data, status) {
        //error
        if (status == "error") {
            alert("Error when loading data");
            return;
        }
        groups = data.content;
        console.log(groups);
        fillToDetailForm(id);
    });
}

function fillToDetailForm(id) {

    // get index groups
    var index = groups.findIndex(x => x.id == id);
    console.log(index);
    // fill data for index
    document.getElementById("id").value = groups[index].id;
    document.getElementById("name").value = groups[index].name;
    document.getElementById("member").value = groups[index].member;
    document.getElementById("fullname").value = groups[index].fullname;
    document.getElementById("createDate").value = groups[index].createDate;
}


function confirmDelete(index) {
    var deleteIds = [];

    for (let index = 0; index < 10; index++) {
        var input = document.getElementById("input" + index);

        if (input === null || input === undefined) {
            break;
        }

        if (input.checked == true) {
            deleteIds.push(groups[index].id);
        }
    }


    var result = confirm("Do you want to delete?");
    if (result) {
        deleteGroups(deleteIds);
    }
}

function deleteGroups(deleteIds) {

    $.ajax({
        url: 'http://localhost:8080/api/v1/groups?ids=' + deleteIds,
        type: 'DELETE',
        success: function(result) {
            // ifsuccess
            //showSuccessAlert();
            initGroup();
        },
        error(jqXHR, textStatus, errorThrown) {
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    });

}

function deleteAll() {

    // get value check
    var isCheck = document.getElementById("inputTotal").checked

    for (let index = 0; index < 10; index++) {
        var input = document.getElementById("input" + index);

        if (input === null || input === undefined) {
            break;
        }
        input.checked = isCheck;
    }

}