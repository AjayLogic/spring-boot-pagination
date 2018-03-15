/**
*
*/

$(document).ready(function(){
	
	$('.nBtn, .table .eBtn').on('click', function(event){
		
		event.preventDefault();
		var href = $(this).attr('href');
		var text = $(this).text();
		
		/* Edit Items */
		if(text == 'Edit'){
			
			$.get(href, function(country, status){
				$('.myForm #id').val(country.id);
				$('.myForm #name').val(country.name);
				$('.myForm #capital').val(country.capital);
			});
			
			$('.myForm #exampleModal').modal();
			
		} else {
			
			$('.myForm #id').val('');
			$('.myForm #name').val('');
			$('.myForm #capital').val('');
			
			$('.myForm #exampleModal').modal();
		}	
	});
	
	/* Delete Items */
	$('.table .delBtn').on('click', function(event){
		event.preventDefault();
		var href = $(this).attr('href');
		$('#myModal2 #delRef').attr('href', href);
		
		$('.myModal2 #myModal2').modal();
		
	});
});