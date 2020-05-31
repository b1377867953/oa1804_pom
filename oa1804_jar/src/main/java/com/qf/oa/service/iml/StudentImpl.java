package com.qf.oa.service.iml;

import com.qf.oa.dao.IStudentDao;
import com.qf.oa.entity.Student;
import com.qf.oa.service.IStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentImpl implements IStudent {

    @Autowired
    private IStudentDao stuDao;
@Transactional()
    public List<Student> queryAll() {
        System.out.println("调用了service");
        return stuDao.queryAll();
    }
}
