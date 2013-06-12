$(document).ready(function(){
	$('input[name=id]').focus(function(){
		alert('on focus');
		$(this).css('outline-color','#FF0000');
	});
});