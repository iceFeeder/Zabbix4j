package com.zabbix4j.user;

import java.util.List;

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;

public class UserGetRequest extends ZabbixApiRequest{
	private Params params = new Params();

    public UserGetRequest() {
        setMethod("user.get");
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }
    
    public class Params extends GetRequestCommonParams {
    	private List<Integer> mediaids;
    	private List<Integer> mediatypeids;
    	private List<Integer> userids;
    	private List<Integer> usrgrpids;
    	private Integer getAccess;
    	private String selectMedias;
    	private String selectMediatypes;
    	private String selectUsrgrps;
		public List<Integer> getMediaids() {
			return mediaids;
		}
		public void setMediaids(List<Integer> mediaids) {
			this.mediaids = mediaids;
		}
		public List<Integer> getMediatypeids() {
			return mediatypeids;
		}
		public void setMediatypeids(List<Integer> mediatypeids) {
			this.mediatypeids = mediatypeids;
		}
		public List<Integer> getUserids() {
			return userids;
		}
		public void setUserids(List<Integer> userids) {
			this.userids = userids;
		}
		public List<Integer> getUsrgrpids() {
			return usrgrpids;
		}
		public void setUsrgrpids(List<Integer> usrgrpids) {
			this.usrgrpids = usrgrpids;
		}
		public Integer getGetAccess() {
			return getAccess;
		}
		public void setGetAccess(Integer getAccess) {
			this.getAccess = getAccess;
		}
		public String getSelectMedias() {
			return selectMedias;
		}
		public void setSelectMedias(String selectMedias) {
			this.selectMedias = selectMedias;
		}
		public String getSelectMediatypes() {
			return selectMediatypes;
		}
		public void setSelectMediatypes(String selectMediatypes) {
			this.selectMediatypes = selectMediatypes;
		}
		public String getSelectUsrgrps() {
			return selectUsrgrps;
		}
		public void setSelectUsrgrps(String selectUsrgrps) {
			this.selectUsrgrps = selectUsrgrps;
		}
    	
    	
    }
}
