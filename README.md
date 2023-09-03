# 项目导入手册

1. 下载 IDEA Community Edition 2023.1.3
    
    ![idea](https://github.com/paripari0616/Resourses/blob/main/vx_img_idea.png?raw=true)
    
    1. 安装选项
        1. 文件夹位置
        2. 安装成功后 双击Intellij IDEA 选择Get from VCS
        
        ![idea_install_s01](https://github.com/paripari0616/Resourses/blob/main/vx_img_20230807193734.png?raw=true)
        
        设定本地路径和克隆项目路径
        
        ![idea_install_s02](https://github.com/paripari0616/Resourses/blob/main/vx_img_20230807193821.png?raw=true)
        
        机器中没有下载好git的学员可以在此时点击 Download and Install 进行Git的安装 全程不需要操作等待一会儿 出现 Git has been installed 后点击 Clone
        
        ![idea_install_s03](https://github.com/paripari0616/Resourses/blob/main/vx_img_20230807193827.png?raw=true)
        
        Clone 完成后进入程序主程序页面 等待Gradle 自动下载完成依赖
        
        ![idea_install_s04](https://github.com/paripari0616/Resourses/blob/main/vx_img_20230807193831.png?raw=true)
        
        在运行程序之前 确保PostgreSQL程序已经安装 同时建立完成 application.yml 对应的数据库和用户， 用户权限如下
        
        application.yml中数据库的相关配置
        
        url：端口后的名称为数据库名
        
        username：用户名
        
        password：密码
        
        driver-class-name：驱动名
        
        ![idea_install_s05](https://github.com/paripari0616/Resourses/blob/main/vx_img_appYml_database.png?raw=true)
        
        PgAdmin4中的配置
              mybatisDatabase：数据库名
        
        mybatisUser：用户
        
        ![idea_install_s06](https://github.com/paripari0616/Resourses/blob/main/vx_img_20230807193859.png?raw=true)
        
        用户权限
        
        ![idea_install_s07](https://github.com/paripari0616/Resourses/blob/main/vx_img_20230807193744.png?raw=true)
        
        配置完数据后点击右侧的 Gradle Symbolic Icon，运行右侧的bootRun 启动程序
        
        ![idea_install_s08](https://github.com/paripari0616/Resourses/blob/main/vx_img_20230807193836.png?raw=true)
        
2. (可选项) 下载Git
    
    ![Git_install_s01](https://github.com/paripari0616/Resourses/blob/main/vx_img_git_version.png?raw=true)
    
3. (可选项) 下载GitExtension
    
    ![Git_install_s02](https://github.com/paripari0616/Resourses/blob/main/vx_img_gitExtensions.png?raw=true)
