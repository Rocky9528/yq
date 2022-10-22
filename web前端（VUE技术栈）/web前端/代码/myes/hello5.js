/*
var num = 10 
var num1 = 10 
var num2 = 10 
var num3= 10  
;["a","b","c"].forEach(function(){

})
console.log(num)  
console.log(1 == "1")
console.log(1 === "1")
*/
var num ;
console.log(num  , typeof num === 'undefined', typeof num === undefined,typeof num == undefined)
num = 10 
console.log(typeof num ==='number')
num = 'abc'
console.log(typeof num === 'string')
//[] ,{} 
var person = {
    address :['北京','西安'],
    name :'zs',
    say: function(){
        console.log('function....')
    }
} 
console.log(person instanceof Object ,person.address instanceof Array ,person.address instanceof Object)
console.log(person.say instanceof Function ,person.say instanceof Object)

/*
(function(){

})()*/