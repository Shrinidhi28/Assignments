
const fs = require('fs');
const path= require('path');
/*Ifs.writeFile(path.join(__dirname,'/trainingdetails','/student.txt')
,'shrinidhi'
,(err)=>{
    if(err) throw err;
    console.log('File written to....');

})*/

fs.readFile(path.join(__dirname,'../demo','/sample.java'),'utf8',(err,data)=>{
    if(err)throw err;
    console.log(data);
})

