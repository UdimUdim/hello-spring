package hello.hellospring.repository;

import hello.hellospring.domain.*;
import org.springframework.data.jpa.repository.*;

import java.util.*;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository{
    @Override
    Optional<Member> findByName(String name);
}
