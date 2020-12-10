$(function() {
    $(".header").load("header.html");
    $(".main").load("main.html");
    $(".footer").load("footer.html");
});

function clickUsers() {
    $(".main").load("viewList.html");
}

function clickhome() {
    $(".main").load("main.html");
}