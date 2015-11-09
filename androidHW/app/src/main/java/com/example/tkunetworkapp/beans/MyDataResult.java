package com.example.tkunetworkapp.beans;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Xavier on 2015/10/30.
 * overwrite on 2015/11/09
 */
public class MyDataResult {
	private Result result;

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	// Inner Classes
	public static class Result {
		private String offset;

		@SerializedName("limit")
		private String limitation;

		private String count;

		private String sort;

		private List<ResultItem> results;

		public String getOffset() {
			return offset;
		}

		public void setOffset(String offset) {
			this.offset = offset;
		}

		public String getLimitation() {
			return limitation;
		}

		public void setLimitation(String limitation) {
			this.limitation = limitation;
		}

		public String getCount() {
			return count;
		}

		public void setCount(String count) {
			this.count = count;
		}

		public String getSort() {
			return sort;
		}

		public void setSort(String sort) {
			this.sort = sort;
		}

		public List<ResultItem> getResults() {
			return results;
		}

		public void setResults(List<ResultItem> results) {
			this.results = results;
		}
	}

	public static class ResultItem {
		private String _id;
		private String RESULT;
		private String S103NAME;
		private String SBMNAME;
		private String SBMXADDR;


		public String get_id() {return _id;}
		public void set_id(String _id) {this._id = _id;}

		public String getRESULT() {return RESULT;}
		public void setRESULT(String result) {RESULT = result;}

		public String getS103NAME() {return S103NAME;}
		public void setS103(String S103NAME) {this.S103NAME = S103NAME;}

		public String getSBMNAME() {return SBMNAME;}
		public void setSBMNAME(String SBMNAME) {this.SBMNAME = SBMNAME;}

		public String getSBMXADDR() {return SBMXADDR;}
		public void setSBMXADDR(String SBMXADDR) {this.SBMXADDR = SBMXADDR;}
	}
}

