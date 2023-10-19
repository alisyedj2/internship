var a = [9,8,4,3,7,3,9,8];
let i=0;
while(i<a.length-1){
    let j =i,index = i,max = a[i];
    while(j<a.length){
        if(a[j]>max){
            max = a[j];
            index = j;
        }
        j++
    }
    a[index]= a[i];
    a[i] = max;
    i++;
}
console.log(a);