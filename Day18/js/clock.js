//获取当前日期时间字符串 格式 yyyy-MM-dd HH:mm:ss.SSS
function getDateStr() {
    //1. 创建日期对象
    let d = new Date();//获取当前日期对象
    //2. 获取当前时间 转为字符串 格式 yyyy-MM-dd HH:mm:ss.SSS
    let fullYear = d.getFullYear();//年
    let month = new String(d.getMonth()+1).padStart(2,"0");//月
    let date = new String(d.getDate()).padStart(2,"0");//日
    let hours = new String(d.getHours()).padStart(2,"0");//时
    let minutes = new String(d.getMinutes()).padStart(2,"0");//分
    let seconds = new String(d.getSeconds()).padStart(2,"0");//秒
    let milliseconds = new String(d.getMilliseconds()).padStart(3,"0");//毫秒

    let dateStr = `${fullYear}-${month}-${date} ${hours}:${minutes}:${seconds}.${milliseconds}`;
    console.log(dateStr);
    return dateStr;
}