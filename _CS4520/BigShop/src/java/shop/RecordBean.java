/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package shop;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Kamurai
 */
@ManagedBean(name="ProductBean")
@RequestScoped
public class RecordBean
{
    //database information
    private int recordid;
    //user information
    private String username;
    private String email;
    //recipient information
    private String rfname;
    private String rlname;
    private String rstreet;
    private String rcity;
    private String rstate;
    private String rcountry;
    private String rpcode;
    private String rphone;
    //billing information
    private String bfname;
    private String blname;
    private String bstreet;
    private String bcity;
    private String bstate;
    private String bcountry;
    private String bpcode;
    private String bphone;
    //payment information
    private String cctype;
    private String ccnumber;
    private String ccexp;
    private String cccode;
    //purchase information
    private String dop;
    private String total;


    /** Creates a new instance of ProductBean */
    public RecordBean(int i, String u, String e, String rf, String rl, String rs, String rc, String rt, String ro, String rd, String rp, String bf, String bl, String bs, String bc, String bt, String bo, String bd, String bp, String cct, String ccn, String cce, String ccc, String dop, String tot)
    {
        //datbase information
        setRecordid(i);
        //user information
        setUsername(u);
        setEmail(e);
        //recepient information
        setRfname(rf);
        setRlname(rl);
        setRstreet(rs);
        setRcity(rc);
        setRstate(rt);
        setRcountry(ro);
        setRpcode(rd);
        setRphone(rp);
        //billing information
        setBfname(bf);
        setBlname(bl);
        setBstreet(bs);
        setBcity(bc);
        setBstate(bt);
        setBcountry(bo);
        setBpcode(bd);
        setBphone(bp);
        //credit card information
        setCctype(cct);
        setCcnumber(ccn);
        setCcexp(cce);
        setCccode(ccc);
        //purchase information
        setDop(dop);
        setTotal(tot);

    }

    public String getEmail() {
        return email;
    }

    public String getRcity() {
        return rcity;
    }

    public String getRcountry() {
        return rcountry;
    }

    public int getRecordid() {
        return recordid;
    }

    public String getRfname() {
        return rfname;
    }

    public String getRlname() {
        return rlname;
    }

    public String getRpcode() {
        return rpcode;
    }

    public String getRstate() {
        return rstate;
    }

    public String getRstreet() {
        return rstreet;
    }

    public String getUsername() {
        return username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRcity(String rcity) {
        this.rcity = rcity;
    }

    public void setRcountry(String rcountry) {
        this.rcountry = rcountry;
    }

    public void setRecordid(int recordid) {
        this.recordid = recordid;
    }

    public void setRfname(String rfname) {
        this.rfname = rfname;
    }

    public void setRlname(String rlname) {
        this.rlname = rlname;
    }

    public void setRpcode(String rpcode) {
        this.rpcode = rpcode;
    }

    public void setRstate(String rstate) {
        this.rstate = rstate;
    }

    public void setRstreet(String rstreet) {
        this.rstreet = rstreet;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBcity() {
        return bcity;
    }

    public String getBcountry() {
        return bcountry;
    }

    public String getBfname() {
        return bfname;
    }

    public String getBlname() {
        return blname;
    }

    public String getBpcode() {
        return bpcode;
    }

    public String getBphone() {
        return bphone;
    }

    public String getBstate() {
        return bstate;
    }

    public String getBstreet() {
        return bstreet;
    }

    public String getCcexp() {
        return ccexp;
    }

    public String getCccode() {
        return cccode;
    }

    public String getCcnumber() {
        return ccnumber;
    }

    public String getCctype() {
        return cctype;
    }

    public String getRphone() {
        return rphone;
    }

    public void setBcity(String bcity) {
        this.bcity = bcity;
    }

    public void setBcountry(String bcountry) {
        this.bcountry = bcountry;
    }

    public void setBfname(String bfname) {
        this.bfname = bfname;
    }

    public void setBlname(String blname) {
        this.blname = blname;
    }

    public void setBpcode(String bpcode) {
        this.bpcode = bpcode;
    }

    public void setBphone(String bphone) {
        this.bphone = bphone;
    }

    public void setBstate(String bstate) {
        this.bstate = bstate;
    }

    public void setBstreet(String bstreet) {
        this.bstreet = bstreet;
    }

    public void setCcexp(String ccexp) {
        this.ccexp = ccexp;
    }

    public void setCccode(String cccode) {
        this.cccode = cccode;
    }

    public void setCcnumber(String ccnumber) {
        this.ccnumber = ccnumber;
    }

    public void setCctype(String cctype) {
        this.cctype = cctype;
    }

    public void setRphone(String rphone) {
        this.rphone = rphone;
    }

    public String getDop() {
        return dop;
    }

    public void setDop(String dop) {
        this.dop = dop;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    
    

    
}
