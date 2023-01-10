package com.pneumo.csrfdemo3.controller.filter;

import jakarta.servlet.*;

import java.io.IOException;

public class CsrfTokenLogger implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

    }
}
