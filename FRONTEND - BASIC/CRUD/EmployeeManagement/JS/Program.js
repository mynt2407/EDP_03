$(function() {
    $(".header").load("header.html");
    $(".main").load("home.html");
    $(".footer").load("footer.html");
});

function clickNavihome() {
    $(".main").load("home.html");
}

function clickNaviViewList() {
    $(".main").load("viewListEmployee.html");
    initEmployee();
}

var employees = [];
var counter = 0;

function Employee(name, department, phone) {
    this.id = ++counter;
    this.name = name;
    this.department = department;
    this.phone = phone;
}

function initEmployee() {

    var url = "https://5fa3f6a7f10026001618e3ae.mockapi.io/Employee";
    //connect with backend

    $.get(url, function(data, status) {
        employees = data;
        console.log(data);
        initTable();
    });
}

function initTable() {

    $('tbody').empty();

    employees.forEach(function(item) {
        $('tbody').append(
            '<tr>' +
            '<td>' + item.name + '</td>' +
            '<td>' + item.department + '</td>' +
            '<td>' + item.phone + '</td>' +
            '<td>' +
            '<a class="edit" title="Edit" data-toggle="tooltip" onclick="openUpdateModel(' + item.id + ')"><i class="material-icons">&#xE254;</i></a>' +
            '<a class="delete" title="Delete" data-toggle="tooltip"  onclick="confirmDelete(' + item.id + ')"><i class="material-icons">&#xE872;</i></a>' +
            '</td>' +
            '</tr>')
    });

}

function openAddModal() {
    ShowModal();
    resetForm();
}

function HideModal() {
    $('#myModal').modal('hide');
}

function ShowModal() {
    $('#myModal').modal('show');
}

function addEmployee() {
    var name = $("#name").val();
    var department = $("#department").val();
    var phone = $("#phone").val();

    // validate ==> return;

    var url = "https://5fa3f6a7f10026001618e3ae.mockapi.io/Employee";
    var newEmployee = new Employee(name, department, phone);
    console.log(newEmployee);
    $.post(url, newEmployee, function(data, status) {
        initEmployee();
        HideModal();
    })
}

function resetForm() {
    $("#id").val() = "";
    $("#name").val() = "";
    $("#department").val() = "";
    $("#phone").val() = "";
}

function openUpdateModel(id) {
    ShowModal();

    // get index employee
    var index = employees.findIndex(x => x.id == id);

    var id = document.getElementById("id").value;
    var name = document.getElementById("name").value;
    var department = document.getElementById("department").value;
    var phone = document.getElementById("phone").value;


    // fill data for index
    employees[index].id = id;
    employees[index].name = name;
    employees[index].department = department;
    employees[index].phone = phone;


    // // Cách 2: gọi theo J Query

    // $("#id").val() = employees[index].id;
    // $("#name").val() = employees[index].name;
    // $("#department").val() = employees[index].department;
    // $("#phone").val() = employees[index].phone;
}

function saveNewInfor() {
    openUpdateModel();
    // var id = document.getElementById("id").value;
    // var name = document.getElementById("name").value;
    // var department = document.getElementById("department").value;
    // var phone = document.getElementById("phone").value;

    // validate ==> return;
    // employees.push(new Employee(name, department, phone));

    // var index = employees.findIndex(x => x.id == id);

    // // update employees
    // employees[index].name = name;
    // employees[index].department = department;
    // employees[index].phone = phone;

    HideModal();
    initEmployee();
    showSuccessAlert();
}

function save() {
    var id = document.getElementById("id").value;

    if (id == null || id == "") {
        addEmployee()

    } else {
        saveNewInfor()
    }
}

function showSuccessAlert() {

}

function confirmDelete(id) {

    var index = employees.findIndex(x => x.id == id);
    var name = employees[index].name;

    var result = confirm("Do you want to delete " + name + " ?");
    if (result) {
        deleteEmployees(index);
    }
}

function deleteEmployees(index) {
    // TODO validate
    employees.splice(index, 1);
    console.log(employees);
    initTable();
}