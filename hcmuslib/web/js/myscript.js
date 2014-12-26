$(document).ready(function(){
  $("#login-btn").on("click",function(){
	window.location.href = "login.html";
  })
  
  $("#search-btn").on("click",function(){
	$(".widget.search").toggle("slow");
  })
  
  $("#contact-us-btn").on("click",function(){
	window.location.href = "contact-us.html";
  })
  
  var type = $("#training-type").val();
  if (type == "personal") {
		$("#personal-training-wrapper").show();
		$("#group-training-wrapper").hide();
	}
	else if (type == "group") {
		$("#group-training-wrapper").show();
		$("#personal-training-wrapper").hide();
	}
  $("#training-type").on("change",function(){
	var type = $(this).val();
	if (type == "personal") {
		$("#personal-training-wrapper").show();
		$("#group-training-wrapper").hide();
	}
	else if (type == "group") {
		$("#group-training-wrapper").show();
		$("#personal-training-wrapper").hide();
	}
  })
  
  $("#additem").on("click",function(){
    var number = parseInt($('#item-container').attr('data-number-item'));
    $.ajax({
        url: "getitem.htm",
        type: "GET",
        data: {
            'number' : number
        },
        success: function(data){
            $('#item-container').append(data);

            $('#item-container').attr('data-number-item',number+1);
            $('#number-items').val(number+1);
        }
    });
  })
  
  $("#order-submit-btn").on("click", function(e){
    var des = $("#order-des").val();
    var number = $('#item-container').attr('data-number-item');
    if (des == '') {
        $("#order-des").closest(".form-group").addClass("has-error");
    }else{
        $("#order-des").closest(".form-group").removeClass("has-error");
    }
    if (number == "0"){
        $("#order-item-message").show();
    }else {
        $("#order-item-message").hide();
    }
    if ( (des == '') || (number == "0") ) {
        return false;
    }
    return true
    
  });
/*   $("#login-submit").on("click",function(e){
	e.preventDefault();
	$("#error-login-message").show();
  }) */

});