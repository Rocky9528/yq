var http = require('http');
var url = require('url');
http.createServer(function(request,response){
		for(var i=0;i<3;i++){
			response.write("hello world");
			
		}
		//localhost:9999?a=b&c=d
		var params =  url.parse(request.url  ,true).query;
		response.write("\n---");	
		response.write(params.a  +' ---');
		response.write("\n---");			
		response.write(params.c  +' ---');	
		
		response.end("end...");
}).listen(9999) ;

console.log('server...');
