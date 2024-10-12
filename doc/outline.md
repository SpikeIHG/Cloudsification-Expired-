#  总览

## 一些初步想法

* ### 功能

  * 通过相机拍摄或上传文件进行云朵种类识别
  * 历史保留功能 保留上传的图片
  * 提供外部链接 诸如nasa 国际云网 等
  * IHG打算提供自己的一套分类方法 然后交互

* ### 形式 

  * app ? web ? 小程序 ?
  * 实现语言 ? java ? c ++ ? c # ?
  * 平台 ？ android studio unity ？
* ### 内部功能
  * 徽章功能
  * 历史记录保留
  * 能否提供卫星云图的接口
  * 一些云朵识别wiki
* ### 开发工具
  * 目前看来是用java 和 android studio 可以了解 kotlin 和 react native ？
  * [Android studio 下载指南](https://blog.csdn.net/leah126/article/details/131268770?ops_request_misc=%257B%2522request%255Fid%2522%253A%252246CECD29-E7A5-45B2-A213-68CA26B18850%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=46CECD29-E7A5-45B2-A213-68CA26B18850&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~top_positive~default-1-131268770-null-null.142^v100^pc_search_result_base2&utm_term=android%20studio&spm=1018.2226.3001.4187)
  * [Android studio 教程](https://www.bilibili.com/video/BV19U4y1R7zV?spm_id_from=333.788.videopod.episodes&vd_source=c8c7f6103570a31005f12d5a33a60b47&p=5)
* ### 内部功能细节 —— 我们需要更多的大。。
  * 用户可以自定义云朵种类，支持新建解释 自创建
  * 可以支持一个 IHG助手  当然名字是可以变的
  * 考虑是否要保存识别历史记录 努力支持吧， 引入 SQlite 之类的 本地保存
  * 具体的徽章设计  想法 第一个 就是集齐所有种类的云 第二个可以就是发现某些罕见的云
* ### 技术问题
  * 单开一个文档