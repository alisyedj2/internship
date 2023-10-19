var a = prompt("enter string input")
var arr = a.split(" ");
a= "";
for (let index = 0; index < arr.length ; index++) {
    for (let j = arr[index].length-1; j >-1; j--) {
        a += arr[index].charAt(j);
    }
    a+=" ";
}
console.log(a);