package com.haozai.generate;

import com.baomidou.mybatisplus.annotation.DbType;
import com.haozai.generate.util.CommonUtils;


/**
 * MySQL 数据库代码生成类
 * @author haozai
 * @since 2019-04-17 10:33
 */
public class MySQL8CodeGenerator {

    public static void main(String[] args) {
        DbType dbType = DbType.MYSQL;
        String dbUrl = "jdbc:mysql://localhost:3306/plasma?useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai";
        String username = "root";
        String password = "root";
        String driver = "com.mysql.cj.jdbc.Driver";
        // 表前缀，生成的实体类，不含前缀
        String [] tablePrefixes = {};
        // 表名，为空，生成所有的表
        String [] tableNames = {};
        // 字段前缀
        String [] fieldPrefixes = {};
        // 基础包名
        String packageName = "com.haozai.plasma";
        CommonUtils.execute(dbType, dbUrl, username, password, driver, tablePrefixes, tableNames, packageName, fieldPrefixes);
    }

}
