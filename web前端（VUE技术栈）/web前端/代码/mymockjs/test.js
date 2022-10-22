let mymock = require('mockjs');

let pers  = mymock.mock({
	'persons|1-6' :[{
		'id|+10':1,
		'name':'@cname',
		'xing':'@cfirst',
		'exing':'@Last',
		
		'desc' : '@string',
		'stuno':'@integer',
		'birthday':'@date',
		'pic':'@image',
		'age|18-60':0 ,
		'brief': '@title',
		'content': '@cword(100)',
		
		'height|160-180.2':0 ,
		'weight|50-100.2-4':0,
		'sex|2-3':true ,
		
		'address|1-3':{'homeaddress':'西安','schooladdress':'北京','workaddress':'泸州'},
		
		'url':'@url' ,
		'ip':"@ip" ,
		'email':'@email',
		'area':'@region',
		'address2':'@county(true)'
	}]
	
	/*
	'persons|1-6' :[{
		'id|+10':1,
		'name|2-5':'zs',
		'age|18-60':0 ,
		'height|160-180.2':0 ,
		'weight|50-100.2-4':0,
		'sex|2-3':true ,
		
		'address|1-3':{'homeaddress':'西安','schooladdress':'北京','workaddress':'泸州'}
	}]
	*/
});

console.log( JSON.stringify(pers ,null, 2)  );