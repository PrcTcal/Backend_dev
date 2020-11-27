

window.onload = function(){
	console.log('javascript');
	
}
		
function test(){
	console.log('test');
	$.ajax({
			type:"GET",
			url:"/getValue",
			success:(data)=>{
				console.log(data);
				$('#here').html(data);
			}
		});
}

function read(){
	$.ajax({
			type:"GET",
			url:"/read",
			success:(data)=>{
				console.log(data);
			}
		});
}
