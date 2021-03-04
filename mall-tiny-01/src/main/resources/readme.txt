MBG逆向工程步骤
1.添加依赖
            <!-- MyBatis 生成器 -->
            <dependency>
                <groupId>org.mybatis.generator</groupId>
                <artifactId>mybatis-generator-core</artifactId>
                <version>1.3.3</version>
            </dependency>
2.添加数据库链接的属性文件  generator.properties
    jdbc.driverClass=com.mysql.cj.jdbc.Driver
    jdbc.connectionURL=jdbc:mysql://localhost:3306/mall?useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai
    jdbc.userId=root
    jdbc.password=
3.添加generatorConfig.xml
    ①在xml中使用<properties resource="指定属性文件"/>
        告诉config.xml  数据库链接的属性在这个文件中
    ②配置context标签
        <plugin>标签  添加插件 例如让生成的类实现序列化接口
        让生成的类生成toString 方法
        必须配置的有
            jdbcConnection 数据库链接信息
                        <!--jdbcConnection 用于指定数据库链接信息-->
                        <jdbcConnection
                                driverClass="${jdbc.driverClass}"
                                connectionURL="${jdbc.connectionURL}"
                                userId="${jdbc.userId}"
                                password="${jdbc.password}">
                            <!--解决mysql驱动升级到8.0后不生成指定数据库代码的问题-->
                            <property name="nullCatalogMeansCurrent" value="true"/>
                        </jdbcConnection>
            javaModelGenerator 用于指定实体类生成的路径
            <javaModelGenerator targetPackage="com.macro.mall.malltiny01.mbg.model" targetProject="mall-tiny-01\src\main\java"/>

            sqlMapGenerator 用于指定映射文件生成的路径
            <sqlMapGenerator targetPackage="com.macro.mall.malltiny01.mbg.mapper" targetProject="mall-tiny-01\src\main\resources"/>

            javaClientGenerator 用于指定mapper接口的生成路径
            <javaClientGenerator type="XMLMAPPER" targetPackage="com.macro.mall.malltiny01.mbg.mapper" targetProject="mall-tiny-01\src\main\java"/>

            table 指定要生成的数据库表名  如果是全部表，使用%
                    <!--指定要生成的表名,如果是全部，就使用%-->
                    <table tableName="pms_brand">
                        <generatedKey column="id" sqlStatement="MySql" identity="true"/>
                    </table>

4.编写生成自定义注释的类
    该类继承DefaultCommentGenerator

5.编写程序执行  在main函数中
    ①读取配置文件
        InputStream in = Generator.class.getResourceAsStream("/generatorConfig.xml");
    ②得到解析器对象
        ConfigurationParser parser = new ConfigurationParser(warnings);
    ③通过解析器得到Configuration对象
        Configuration conf = parser.parseConfiguration(in);
    ④得到生成器
                DefaultShellCallback callback = new DefaultShellCallback(overwrite);
                //创建MBG
                MyBatisGenerator generator = new MyBatisGenerator(conf, callback, warnings);
                //生成代码
                generator.generate(null);