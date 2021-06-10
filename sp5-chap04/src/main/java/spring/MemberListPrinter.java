package spring;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;

public class MemberListPrinter {

    private MemberDao memberDao;
    private MemberPrinter printer;

    public MemberListPrinter() {
    }

    public void printAll() {
        Collection<Member> members = memberDao.selectAll();
        members.forEach(m -> printer.print(m));
    }

    @Autowired
    public void setMemberDao(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    @Autowired
    public void setPrinter(MemberSummaryPrinter printer) {
        this.printer = printer;
    }
}
