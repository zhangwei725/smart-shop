package com.smart.rest.service;

import com.alibaba.druid.wall.violation.ErrorCode;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.smart.rest.common.RespCode;
import com.smart.rest.domain.entity.Member;
import com.smart.rest.domain.vo.MemberVo;
import com.smart.rest.exception.ServiceException;
import com.smart.rest.mapper.MemberMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class MemberServiceImpl implements MemberService {
    @Resource
    MemberMapper memberMapper;

    /**
     * tooken
     *
     * @param kw
     * @param password
     * @return
     */
    @Override
    public Member login(String kw, String password) {
        MemberVo vo = null;
        // 通过用户名手机号邮箱
        QueryWrapper<Member> qw = new QueryWrapper<>();
        qw.eq(Member.COL_USERNAME, kw)
                .or()
                .eq(Member.COL_PHONE, kw)
                .or()
                .eq(Member.COL_EMAIL, kw);
        Member member = memberMapper.selectOne(qw);
        if (member != null) {
            if (member.getStatus() == 0) {
                if (member.getPassword().equals(password)) {
                    vo = new MemberVo();
                    BeanUtils.copyProperties(vo, member);
                } else {
                    throw new ServiceException(RespCode.ERROR_MEMBER_PASSWORD);
                }
            } else {
                throw new ServiceException(RespCode.ERROR_MEMBER_PASSWORD);
            }
        } else {
            throw new ServiceException(RespCode.ERROR_MEMBER_PASSWORD);
        }
        return vo;
    }

    @Override
    public int register() {
        return 0;
    }
}
