

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
		data:{id: document.getElementById('id').value,
			name: document.getElementById('name').value},
		success:(data)=>{
			console.log(data);
		}
	});
}
function findById(){
	$.ajax({
		type:"GET",
		url:"/findById",
		data:{id:document.getElementById('id').value},
		success:(data)=>{
			console.log(data);
		}
	});
}

function updateById(){
	$.ajax({
		type:"PUT",
		url:"/updateById",
		data:{id:document.getElementById('id').value,
			name:document.getElementById('name').value},
		success:(data)=>{
			console.log(data);
		}
	});
}

function deleteById(){
	$.ajax({
		type:"DELETE",
		url:"/deleteById",
		data:{id:document.getElementById('id').value},
		success:(data)=>{
			console.log(data);
		}
	});
}


