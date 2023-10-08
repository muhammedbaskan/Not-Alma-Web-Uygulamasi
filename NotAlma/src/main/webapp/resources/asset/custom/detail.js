$(document).ready(function()){
	 	getNote();
});	
function getNote(){	 	
	$("none_title").attr("disabled",true);
	$("none_detail").attr("disabled",true);
	$("#updateBtn").html("Güncelle");
	
	$.ajax({
		type:"POST",
		url:'./../getNote',
		contentType:'text/plain',
		data:$("#id").val()+"",
		success:function(data){
			$("none_title").val(data.title);
			$("none_detail").html(data.content);					
		},error:function(data){
			alert(data);
		}	
		});


}
var updatem= false;
function update(){
	if(!updatem){
	$("none_title").attr("disabled",false);
	$("none_detail").attr("disabled",false);
	
	$("#updateBtn").html("Kaydet");
	updatem = true;
	}else{
		updateNote();
		updatem = false;
	}
	
	function updateNote(){
		var param ={
				id:$("id").val(),
				title:$("#note_title").val(),
				content:$("note_detail").val()
		}
		
		var ser_data = JSON.stringify(param);
		$.ajax({
			type:"POST",
			contentType:'application/json; charset=UTF-8',
			url:'./../updateNote',
			data: ser_data,
			success:function(data){
				alert(data);
				getNote();
			},error:function(data){
				alert(data);
			}	
			
			
		});
	}	
	
	function deleteNote(){
		var param ={
				id:$("id").val(),

		}
		
		var ser_data = JSON.stringify(param);
		$.ajax({
			type:"POST",
			contentType:'application/json; charset=UTF-8',
			url:'./../deleteNote',
			data: ser_data,
			success:function(data){
				alert(data);
				window.history.back();
			},error:function(data){
				alert(data);
			}	
			
			
		});
	}	
	
		
	
	
	
}