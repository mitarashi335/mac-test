
$(function(){
	$('button').hover(
		function(){
			$(".A").fadeIn();
			$(".A").animate({opacity:1.0});
		},
		function(){
			$(".A").fadeOut();
		});
});