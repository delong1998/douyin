# Java仿抖音短视频小程序开发 全栈式实战项目
仿抖音小程序/小程序后台/管理后台
小程序前端 / 小程序后台 / 网页管理后台


# 碎碎念：
经过两个月断断续续，终于把Java仿抖音短视频小程序开发全栈式实战项目过了一遍，还是学习到很多的东西的，因为以前只做过网站后台，加上现在小程序比较火，所以找了一个小程序的教程学习一下。

有一些前端的基础，小程序学起来还是比较容易的，而且觉得小程序那些交互、弹窗还有访问接口、上传媒体，比网站方便很多，提供了很多组件，但是相应的也带来了一些限制性，小程序读取数据格式和vue有很多相似的地方，比如数据渲染。
后端部分spingboot之前也用过了，不过springboot的重构是第一次用，不管整合什么，springboot都比ssm更方便呀。
Swagger2用来管理API真的蛮方便的，很直观，也方便测试，特别有利于前后端分离的开发。
用了Ffmpeg来处理视频，给视频添加背景音乐，制作封面。
通过这个项目粗略的接触了Redis还有Zookeeper，用了Redis做缓存小程序登录的用户数据，用Zookeeper实现两个后台之间的连通， 小程序后台实时监控网页管理后台是否有上传新的背景音乐，如果有则执行下载。并且是在Linux环境下，顺便熟悉了一些linux，但内容比较少，以后要继续学习。

网上很多资源缺一些视频，我在网上整理了几个资源，里面有视频和代码，应该是比较全的，有缺的可以问问我
# 百度云链接：
链接：https://pan.baidu.com/s/1jj_jT71IsmjeBMRkCTt1ag 
提取码：1npw 

# 自己的代码实现：
下面是我自己实现的代码，因为有些版本问题还有我用的是Idea，所以遇到了一些坑，但是后面都填啦，有些小细节不一样：

douyin-qian  是小程序的前端
imooc-video-admin  网站管理后台 （这一块没怎么写直接拿过来用了）
vedio   小程序的后台
小程序后台用的是Springboot框架 网页管理后台用的是ssm框架

# 分享
有遇到什么坑可以分享一下，说不定我也遇到过，可以一起解决。
