let size = Number (prompt("enter a size of Array"))

let arr1 = [];
for(var i=0;i<size;i++) {
    arr1[i] = Number (prompt('enter element ' +(i+1)));
}

function arrSort(arr1) { 
	arr1.sort((a,b)=>a-b); 
	arr1.reverse(); 
	return arr1; 
} 

console.log(arrSort(arr1)); 

