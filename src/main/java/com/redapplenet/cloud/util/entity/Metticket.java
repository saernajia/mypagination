package com.redapplenet.cloud.util.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "metticket")
@NameStyle(Style.normal)
public class Metticket {
	@Id
    private String ticketid;

    private String channel;

    private String userid;

    private String username;

    private String mobile;

    private String passertype;

    private String pname;

    private String idtype;

    private String idnumber;

    private String gender;

    private String pid;

    private String gmobile;

    private String pnr;

    private String seat;

    private String ticket_type;

    private String tic_status;

    private String tkt_status;

    private String eticketno;

    private String segid;

    private String sail;

    private String from_airport;

    private String to_airport;

    private String from_term;

    private String to_term;

    private String afrom;

    private String ato;

    private String airname;

    private String airways;

    private String fnumber;

    private String fdate;

    private String ftime;

    private String ttime;

    private String standard_price;

    private String paymoney;

    private String fare;

    private String fmoney;

    private String money;

    private String discount;

    private String airport_tax;

    private String fuel_tax;

    private String other_tax;

    private String iata_tax;

    private String pricing;

    private String ticket_price;

    private String tax_price;

    private String adtindex;

    private String fbc;

    private String share_code;

    private String opcar_airline;

    private String opcar_fltno;

    private String stop_num;

    private String meal;

    private String eticket;

    private String outdatetime;

    private String chgroledesc;

    private String changedesc;

    private String cstatus;

    private String changeid;

    private String tictype;

    private String sourceid;

    private String productid;

    private String productname;

    private String passport_valid;

    private String passport_country;

    private String country;

    private String birthday;

    private String flight_time;

    private String spectype;

    private String specno;

    private String jccardno;
}
