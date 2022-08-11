export function dealDate(date) {
  let year = date.getFullYear();
  let month = parseInt(date.getMonth()) + 1;
  let day = date.getDate().toString().padStart(2,"0");
  let hour = date.getHours().toString().padStart(2, '0');
  let minute = date.getMinutes().toString().padStart(2,'0');
  let time = year+'-'+month+'-'+day+' '+hour+':'+minute;//时间进行拼接
  return time;
}

export function isTomorrow(date) {
  let now = new Date();
  let year = now.getFullYear();
  let month = now.getMonth()+1;
  let day = now.getDate();
  let arr = date.split(' ')[0].split('-');
  return year > arr[0] || month > arr[1] || day > [arr[2]];
}