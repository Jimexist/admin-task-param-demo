# Admin Task Param Demo

Use Postman or:

```sh
curl -X POST -H "Cache-Control: no-cache" -H "Postman-Token: 587e6e5f-4f29-3966-7b72-4c735aceede2" "http://localhost:8081/tasks/funny?name=James%20Bond&name=Terry%20Thylor&name=%F0%9F%90%A2"
```

and it shall print out:

```
INFO  [2017-03-14 02:54:32,449] com.madadata.demo.ParamDemoFunnyTask: key 'name', value 'James Bond'
INFO  [2017-03-14 02:54:32,449] com.madadata.demo.ParamDemoFunnyTask: key 'name', value 'Terry Thylor'
INFO  [2017-03-14 02:54:32,449] com.madadata.demo.ParamDemoFunnyTask: key 'name', value '🐢'
0:0:0:0:0:0:0:1 - - [14/Mar/2017:02:54:32 +0000] "POST /tasks/funny?name=James%20Bond&name=Terry%20Thylor&name=%F0%9F%90%A2 HTTP/1.1" 200 0 "-" "curl/7.51.0" 72
```