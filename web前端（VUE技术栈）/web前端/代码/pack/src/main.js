require('./style.css')

var print = require('./print');
var add = require('./add');
var result = add.add(1,2);

print.print(result);