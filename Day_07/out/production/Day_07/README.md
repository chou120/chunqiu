String   StringBuffer 和StringBuilder的区别
1.String 定义的字符串内容不可变   后两者定义的内容长度是可以变的
2. StringBuffer 是线程安全的  执行效率低   数据安全
   StringBuilder 线程不安全   执行效率高   数据不安全
   
3. 如果数据量小的情况下 可以用String
   如果数据量大
            a.如果是单线程情况 那么我们可以使用 StringBuilder
            b.如果是多线程情况 可以用    StringBuffer
   