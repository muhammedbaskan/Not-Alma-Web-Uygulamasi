function addNote(){
	var param ={
			title:"Notlarım",
			content:"deneme"
	}
	
	var ser_data = JSON.stringify(param);
	$.ajax({
		type:"POST",
		contentType:'application/json; charset=UTF-8',
		url:'addNote',
		data: ser_data,
		success:function(data){
			alert(data);
		},error:function(data){
			alert(data);
		}	
		
		
	});
}