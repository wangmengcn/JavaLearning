package com.eclipsesv.model;

import org.springframework.data.mongodb.repository.MongoRepository;
/**
 * Created by eclipse on 16/8/24.
 */
public interface MemberRepository extends MongoRepository<Member,String>{
    public Member findByusername(String username);
}
