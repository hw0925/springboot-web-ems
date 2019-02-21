package com.hw;

import com.hw.dao.EmployeeMapper;
import com.hw.entity.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestEmp {
    @Autowired
    private EmployeeMapper employeeMapper;

   @Test
    public void test1(){
       List<Employee> employees = employeeMapper.selectAllEmp();
       System.out.println(employees);
   }
    @Test
    public void test2(){
       employeeMapper.insert(new Employee(0,"huahua",3000.0,21));

    }
    @Test
    public void test3(){
        employeeMapper.updateByPrimaryKeySelective(new Employee(1,null,4000.0,null));
   }

    @Test
    public void test4(){

        System.out.println(employeeMapper.selectByPrimaryKey(1));
    }
    @Test
    public void test5(){

       employeeMapper.updateByPrimaryKeySelective(new Employee());
    }



}
