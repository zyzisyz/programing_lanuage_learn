var map = new Map();
map.set('this', 1);
map.set('that', 2);

for(var x of map){
	console.log(x)
}

var set = new Set();
var n = 100;
for(i=0; i<n; i++){
	set.add(i);
}

for(var x of set){
	console.log(x);
}
