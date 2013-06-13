$(document).ready(function(){
	$('input[type=text]').focus(function(){
		$(this).css('border-color','#00ff00');
	});
	$('input[type=text]').focusout(function(){
		$(this).css('border-color','');
	});
});