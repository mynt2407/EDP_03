$(function() {
    $(".header").load("header.html");
    $(".main").load("main.html");
    $(".footer").load("footer.html");
});

function clickUsers() {
    $(".main").load("body.html");
}

$(document).ready(function() {
    $("#myInput").on("keyup", function() {
        var value = $(this).val().toLowerCase();
        $("#myTable tr").filter(function() {
            $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
        });
    });
});