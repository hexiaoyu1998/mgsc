package com.example.demo.dao;

import javax.servlet.http.HttpServletRequest;

public interface MemberDao {
    Object findandsetId(HttpServletRequest request);
    Object findById(HttpServletRequest request);
    Object reNew(HttpServletRequest request);
}
