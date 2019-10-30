$(document).ready(function () {
  $("#searchBtn").on("click", function () {
    event.preventDefault();
    var bla = $('#searchBox').val();
    console.log(bla);
    search_box(bla);
  });
  $("#bridal").mouseover(function () {
    $("#mehndiText").slideDown("slow");
    $("#bridalText").slideDown("slow");

  });
  $("#mehndi").mouseover(function () {
    $("#mehndiText").slideDown(1000);
    $("#bridalText").slideDown(1000);
    $("#makeUpText").slideDown(1000);
    $("#makeUpImage").slideDown("slow");
  });
  $(".gallery").mouseover(function () {
    $("#facialText").slideDown(1000);
    $("#makeUpText").slideDown(1000);

  });

  $("#home").on("click", function () {
    event.preventDefault();
    $(".contain").css("display", "block");
    $("#searchResult").css("display", "none");
  });
  $(".logo").on("click", function () {
    event.preventDefault();
    $(".homePage").css("display", "block");
    $(".servicesOffer").css("display", "none");
  });



  // ##################### feedback ###############################
  $(".feedBridal").on("click", function () {
    event.preventDefault();
    $(".feedBridal").addClass("active");
    $(".feedBack").removeClass("active");   
    $(".feedMaps").removeClass("active");
    $(".feedMehndi").removeClass("active");

    console.log($("#feedBridal").hasClass("active"));
    $(".servicesOffer").css("display","block");
    $(".homePage").css("display","none");
    $(".Bridal").css("display" , "block");
    $(".Feedback").css("display" , "none");
    $(".Maps").css("display" , "none");
    $(".Mehndi").css("display" , "none");
  });
  $(".feedMehndi").on("click", function () {
    event.preventDefault();
    $(".feedMehndi").addClass("active");
    $(".feedBridal").removeClass("active");
    $(".feedBack").removeClass("active");
    $(".feedMaps").removeClass("active");

    $(".homePage").css("display","none");
    $(".servicesOffer").css("display","block");
    $(".Bridal").css("display", "none");
    $(".Feedback").css("display", "none");
    $(".Maps").css("display", "none");
    $(".Mehndi").css("display", "block");
  });
  $(".feedMaps").on("click", function () {
    event.preventDefault();
    $(".feedMaps").addClass("active");
    $(".feedBridal").removeClass("active");
    $(".feedBack").removeClass("active");
    $(".feedMehndi").removeClass("active");
    
    $(".homePage").css("display","none");
    $(".servicesOffer").css("display","block");
    $(".Bridal").css("display", "none");
    $(".Feedback").css("display", "none");
    $(".Maps").css("display", "block");
    $(".Mehndi").css("display", "none");
  });
  $(".feedBack").on("click", function () {
    event.preventDefault();
    $(".feedBack").addClass("active");
    $(".feedBridal").removeClass("active");
    $(".feedMaps").removeClass("active");
    $(".feedMehndi").removeClass("active");

    $(".homePage").css("display","none");
    $(".servicesOffer").css("display","block");
    $(".Bridal").css("display", "none");
    $(".Feedback").css("display", "block");
    $(".Maps").css("display", "none");
    $(".Mehndi").css("display", "none");
  });
 

// ############################### maps #####################################
// $(document).ready(function () {
//   $("#mapsBtn").on("click", function () {
//     var copyText = document.getElementById("mapsLink");
//     copyText(this)
//     document.execCommand("copy");
//     alert("Copied the text: " + copyText.value);
//   });

});


// ##############################################################


// #############################################################
function search_box(data) {
  console.log("Inside search_box() >>>>>>>>>>>>>>>>>>>>>>");
  var dataString = '{ "field1":"' + data + '"}';
  console.log("datastring : " + dataString);
  $.ajax({
    type: 'POST',
    url: "http://192.168.1.4:5007/search_box",
    data: dataString,
    success: function (data) {
      console.log("printing data of pend_get_vul ***********");
      console.log(data);


      $("#searchResult").css("display", "block");
      $(".contain").css("display", "none");

    }
  });
}