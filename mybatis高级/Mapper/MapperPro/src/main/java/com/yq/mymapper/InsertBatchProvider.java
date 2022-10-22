package com.yq.mymapper;

import com.yq.entity.Student;
import org.apache.ibatis.mapping.MappedStatement;
import tk.mybatis.mapper.entity.EntityColumn;
import tk.mybatis.mapper.mapperhelper.EntityHelper;
import tk.mybatis.mapper.mapperhelper.MapperHelper;
import tk.mybatis.mapper.mapperhelper.MapperTemplate;
import tk.mybatis.mapper.mapperhelper.SqlHelper;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class InsertBatchProvider  extends MapperTemplate {
    public InsertBatchProvider(Class<?> mapperClass, MapperHelper mapperHelper) {
        super(mapperClass, mapperHelper);
    }

    public  void insertBatch(MappedStatement ms){
//     //SQL语句
//        Class<?> entityClass = this.getEntityClass(ms);
//        String tableName = this.tableName(entityClass);
//
//
//
//
//        /*
//            xxxxxx
//                (stu.getStuNo(),stu.getName(),stu.getAge())
//         */
//        //insert into tb_student values
//        SqlHelper.insertIntoTable(entityClass,tableName) ;
//        StringBuilder sql = new StringBuilder();
//        sql.append("values");
//        sql.append(" <foreach collection=\"list\" item=\"stu\" seprator=\",\">");
////                ('1001','zs',23),
//
//
//        sql.append(" </foreach>");
//
//
//
//
//
//
//
//
//
//
//
//
//        Set<EntityColumn> columnList = EntityHelper.getColumns(entityClass);
//        EntityColumn logicDeleteColumn = SqlHelper.getLogicDeleteColumn(entityClass);
//        this.processKey(sql, entityClass, ms, columnList);
//        sql.append(SqlHelper.insertIntoTable(entityClass, this.tableName(entityClass)));
//        sql.append(SqlHelper.insertColumns(entityClass, false, false, false));
//        sql.append("<trim prefix=\"VALUES(\" suffix=\")\" suffixOverrides=\",\">");
//        Iterator var6 = columnList.iterator();
//
//        while(true) {
//            while(true) {
//                EntityColumn column;
//                do {
//                    if (!var6.hasNext()) {
//                        sql.append("</trim>");
//                        return sql.toString();
//                    }
//
//                    column = (EntityColumn)var6.next();
//                } while(!column.isInsertable());
//
//                if (logicDeleteColumn != null && logicDeleteColumn == column) {
//                    sql.append(SqlHelper.getLogicDeletedValue(column, false)).append(",");
//                } else {
//                    if (column.isIdentity()) {
//                        sql.append(SqlHelper.getIfCacheNotNull(column, column.getColumnHolder((String)null, "_cache", ",")));
//                    } else {
//                        sql.append(SqlHelper.getIfNotNull(column, column.getColumnHolder((String)null, (String)null, ","), this.isNotEmpty()));
//                    }
//
//                    if (column.isIdentity()) {
//                        sql.append(SqlHelper.getIfCacheIsNull(column, column.getColumnHolder() + ","));
//                    } else {
//                        sql.append(SqlHelper.getIfIsNull(column, column.getColumnHolder((String)null, (String)null, ","), this.isNotEmpty()));
//                    }
//                }
//            }
//        }


    }
}
