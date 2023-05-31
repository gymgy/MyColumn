# My Column

![index](static-files/首页.png)


## 项目名称：仿知乎专栏的Spring Boot项目

- 主要功能包括：个人专栏的添加和修改，专栏中文章的添加修改，个人主页信息更新，聊天机器人

## 项目运行

1. 使用关系数据库mysql，运行src/main/resources/my-column-schema.sql新建数据库
2. 在src/main/resources/application.properties中填写数据库用户名与密码
3. 在src/main/resources/application.properties中填写<br>chatgpt.token=xxx<br>
  chatgpt.proxy-host=xxx.xxx.xxx.xxx<br>
  chatgpt.proxy-port=xxx<br>
4. reload project
5. 运行MyColumnApplication

## 注意
***注册登录时验证码必须输入为小写英文字母***


## 效果预览

- 首页

  ![首页](static-files/首页.png)

- 登录

  ![登录](static-files/登录.png)

- 专栏

  ![专栏](static-files/专栏.png)
  
- 个人中心

  ![个人中心](static-files/个人中心.png)

- 文章编辑

  ![文章编辑](static-files/文章编辑.png)

- 文章详情

  ![文章详情](static-files/文章详情.png)

- chatGPT

  ![chatGPT](static-files/chatGPT.png)
