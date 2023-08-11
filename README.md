# 项目导入手册

1. 下载 IDEA Community Edition 2023.1.3
    
    ![idea]([%E9%A1%B9%E7%9B%AE%E5%AF%BC%E5%85%A5%E6%89%8B%E5%86%8C%2071c5b04d0b194c0da009a71acac65aa7/Untitled.png](https://github.com/paripari0616/Resourses/blob/main/vx_img_idea.png?raw=true))
    
    1. 安装选项
        1. 文件夹位置
        2. 安装成功后 双击Intellij IDEA 选择Get from VCS
        
        ![Untitled](%E9%A1%B9%E7%9B%AE%E5%AF%BC%E5%85%A5%E6%89%8B%E5%86%8C%2071c5b04d0b194c0da009a71acac65aa7/Untitled%201.png)
        
        设定本地路径和克隆项目路径
        
        ![Untitled](%E9%A1%B9%E7%9B%AE%E5%AF%BC%E5%85%A5%E6%89%8B%E5%86%8C%2071c5b04d0b194c0da009a71acac65aa7/Untitled%202.png)
        
        机器中没有下载好git的学员可以在此时点击 Download and Install 进行Git的安装 全程不需要操作等待一会儿 出现 Git has been installed 后点击 Clone
        
        ![Untitled](%E9%A1%B9%E7%9B%AE%E5%AF%BC%E5%85%A5%E6%89%8B%E5%86%8C%2071c5b04d0b194c0da009a71acac65aa7/Untitled%203.png)
        
        Clone 完成后进入程序主程序页面 等待Gradle 自动下载完成依赖
        
        ![Untitled](%E9%A1%B9%E7%9B%AE%E5%AF%BC%E5%85%A5%E6%89%8B%E5%86%8C%2071c5b04d0b194c0da009a71acac65aa7/Untitled%204.png)
        
        在运行程序之前 确保PostgreSQL程序已经安装 同时建立完成 application.yml 对应的数据库和用户， 用户权限如下
        
        application.yml中数据库的相关配置
        
        url：端口后的名称为数据库名
        
        username：用户名
        
        password：密码
        
        driver-class-name：驱动名
        
        ![Untitled](%E9%A1%B9%E7%9B%AE%E5%AF%BC%E5%85%A5%E6%89%8B%E5%86%8C%2071c5b04d0b194c0da009a71acac65aa7/Untitled%205.png)
        
        PgAdmin4中的配置
              mybatisDatabase：数据库名
        
        mybatisUser：用户
        
        ![Untitled](%E9%A1%B9%E7%9B%AE%E5%AF%BC%E5%85%A5%E6%89%8B%E5%86%8C%2071c5b04d0b194c0da009a71acac65aa7/Untitled%206.png)
        
        用户权限
        
        ![Untitled](%E9%A1%B9%E7%9B%AE%E5%AF%BC%E5%85%A5%E6%89%8B%E5%86%8C%2071c5b04d0b194c0da009a71acac65aa7/Untitled%207.png)
        
        配置完数据后点击右侧的 Gradle Symbolic Icon，运行右侧的bootRun 启动程序
        
        ![Untitled](%E9%A1%B9%E7%9B%AE%E5%AF%BC%E5%85%A5%E6%89%8B%E5%86%8C%2071c5b04d0b194c0da009a71acac65aa7/Untitled%208.png)
        
2. (可选项) 下载Git
    
    ![Untitled](%E9%A1%B9%E7%9B%AE%E5%AF%BC%E5%85%A5%E6%89%8B%E5%86%8C%2071c5b04d0b194c0da009a71acac65aa7/Untitled%209.png)
    
3. (可选项) 下载GitExtension
    
    ![Untitled](%E9%A1%B9%E7%9B%AE%E5%AF%BC%E5%85%A5%E6%89%8B%E5%86%8C%2071c5b04d0b194c0da009a71acac65aa7/Untitled%2010.png)
