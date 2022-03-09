
const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});
 
readline.question('Enter numbers: ', (number) => {
  findThirdLargeNum(number)
	readline.close();
})

 
function sort(str){

  var arr = str.split('');
  var tmp;

 
  for(var i = 0; i < arr.length; i++){
    for(var j = i + 1; j < arr.length; j++){
      if(arr[i] > arr[j]){
        tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
      }
    }
  }
  return arr.join('');
}


function findThirdLargeNum(number){
 
  let isnumber = /^\d+$/.test(number);
  if(isnumber){
    var sortedNumber = sort(number);
    var arrNumber = sortedNumber.split('');
    var count = 0;
    var answer = 0; 

    for(var i = 1; i <= arrNumber.length; i++){
        if(arrNumber[i-1]< arrNumber[i]){
          answer = arrNumber[i-1];
          count++; 
          if(count == 3){
              console.log("Third largest number is: "+answer); 
          }
        }
    }
  }
  else{
      console.log("Please use numbers"); 
  }
    
}
