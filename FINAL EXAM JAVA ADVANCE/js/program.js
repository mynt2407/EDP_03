$(function() {
    $(".header").load("header.html");
    $(".main").load("main.html");
    $(".leftnavi").load("leftnavi.html");
    $(".footer").load("footer.html");
});

function clickGroupManager() {
    $(".main").load("viewListGroups.html");
    // initEmployee();
}