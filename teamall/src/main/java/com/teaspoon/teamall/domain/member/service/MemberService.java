package com.teaspoon.teamall.domain.member.service;

import com.teaspoon.teamall.domain.member.dto.*;

public interface MemberService {

    int join(MemberDTO memberDTO);

    int updateMember(MemberDTO memberDTO);

    int deleteMember(MemberDTO memberDTO);

    LoginResponseDTO login(LoginDTO loginDTO);

    FindInfoResponseDTO findID(FindInfoDTO findInfoDTO);

    FindInfoResponseDTO findPW(FindInfoDTO findInfoDTO);
}