function person(pname,page){//name ,age
    return {
        name:  pname,
        age: page
    };
}

function person(pname,page){//name ,age
    return {
         pname,
         page
    };
}




var person = {
    name:'zs',
    age: 23

}
var pname = person.name ;
var page = person.age ;
console.log(`${pname},${page}`);


var {name,age} = person ;
console.log(`${name}  --- ${age}`);


const fruit = [   'apple' ,'orange'] ;
let [one,two] = fruit ;
console.log(one);
console.log(two);

const fruit2 = [ ...fruit ,'pear']; 
console.log(fruit2);


let student = {name:'zs' , age :23};
let student2 = {...student , height:170};
console.log(student2);
