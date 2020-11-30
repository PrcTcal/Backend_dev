

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

function save(){
	$.ajax({
		type:"POST",
		url:"/save",
		data:{id:"asd123",
			name:"glen"},
		success:(data)=>{
			console.log(data);
		}
	});
}
function findById(){
	$.ajax({
		type:"GET",
		url:"/findById",
		data:{id:"asd123"},
		success:(data)=>{
			console.log(data);
		}
	});
}

function updateById(){
	$.ajax({
		type:"PUT",
		url:"/updateById",
		data:{id:"asd123",
			name:"park"},
		success:(data)=>{
			console.log(data);
		}
	});
}

function deleteById(){
	$.ajax({
		type:"DELETE",
		url:"/deleteById",
		data:{id:"asd123"},
		success:(data)=>{
			console.log(data);
		}
	});
}
