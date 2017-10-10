package com.lam.utilString;

import org.junit.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PalindromizeTest {
	Palindromize pali;

	@Before
	public void setUp() throws Exception {
		this.pali = new Palindromize();
	}

	@After
	public void tearDown() throws Exception {
		this.pali = null;
	}

	@Test
	public void testMinAdds() {
		Assert.assertEquals("cigartragic", this.pali.minAdds("cigartragic"));
		Assert.assertEquals("adda", this.pali.minAdds("add"));
		Assert.assertEquals("redocpotopcoder", this.pali.minAdds("redocpot"));
		Assert.assertEquals("acabaca", this.pali.minAdds("acaba"));
		Assert.assertEquals("abczyxyzcba", this.pali.minAdds("abczyxyz"));
	}

	@Test
	public void testMinAddsSystemTest() {
		Assert.assertEquals("adda", this.pali.minAdds("add"));
		Assert.assertEquals("cigartragic", this.pali.minAdds("cigartragic"));
		Assert.assertEquals("redocpotopcoder", this.pali.minAdds("redocpot"));
		Assert.assertEquals("acabaca", this.pali.minAdds("acaba"));
		Assert.assertEquals("z", this.pali.minAdds("z"));
		Assert.assertEquals("fgf", this.pali.minAdds("fg"));
		Assert.assertEquals("aa", this.pali.minAdds("aa"));
		Assert.assertEquals("plwlp", this.pali.minAdds("plw"));
		Assert.assertEquals("qccq", this.pali.minAdds("qcc"));
		Assert.assertEquals("ibi", this.pali.minAdds("ibi"));
		Assert.assertEquals("mmzmm", this.pali.minAdds("mmz"));
		Assert.assertEquals("abczyxyzcba", this.pali.minAdds("abczyxyz"));
		Assert.assertEquals(
				"gmekkywzhoaqytntskrczvcnjoojncvzcrkstntyqaohzwykkemg",
				this.pali.minAdds("gmekkywzhoaqytntskrczvcnjoojncvzcr"));
		Assert.assertEquals(
				"cxbmzhzqyrfituraaghzkqmmzsjevssvejszmmqkzhgaarutifryqzhzmbxc",
				this.pali.minAdds("cxbmzhzqyrfituraaghzkqmmzsjevssve"));
		Assert.assertEquals("ypyelbxwwtisundqyjttlcclttjyqdnusitwwxbleypy",
				this.pali.minAdds("ypyelbxwwtisundqyjttlcclttjyq"));
		Assert.assertEquals(
				"tnfxecyhmvpnseokabfrbrqpnzdphmfwdwfmhpdznpqrbrfbakoesnpvmhycexfnt",
				this.pali.minAdds("tnfxecyhmvpnseokabfrbrqpnzdphmfwdw"));
		Assert.assertEquals(
				"ruvsrwrklmxfiyxusvbaojvklsjzgoqflhbxikrcwipgrmvaavmrgpiwcrkixbhlfqogzjslkvjoabvsuxyifxmlkrwrsvur",
				this.pali.minAdds("ruvsrwrklmxfiyxusvbaojvklsjzgoqflhbxikrcwipgrmvaa"));
		Assert.assertEquals("jsqpxbdntndbxpqsj", this.pali.minAdds("jsqpxbdntndbxp"));
		Assert.assertEquals(
				"lxgkfbtxupxbogrddlzbgroocvssvcoorgbzlddrgobxpuxtbfkgxl",
				this.pali.minAdds("lxgkfbtxupxbogrddlzbgroocvssvcoorgbz"));
		Assert.assertEquals("oetomccyeppqglbaauoejeouaablgqppeyccmoteo",
				this.pali.minAdds("oetomccyeppqglbaauoejeouaablgqppey"));
		Assert.assertEquals(
				"uolhcqbmsbmhyordofaqjhagsxvxzdmowtftwomdzxvxsgahjqafodroyhmbsmbqchlou",
				this.pali.minAdds("uolhcqbmsbmhyordofaqjhagsxvxzdmowtftwomdzxvxsg"));
		Assert.assertEquals(
				"zmoymxhlilfedhtgjdefgxyqoishvebgiigbevhsioqyxgfedjgthdeflilhxmyomz",
				this.pali.minAdds("zmoymxhlilfedhtgjdefgxyqoishvebgiigbevhsioqyxgfedj"));
		Assert.assertEquals(
				"ftvejqxlmphklftactrhydltmmtldyhrtcatflkhpmlxqjevtf",
				this.pali.minAdds("ftvejqxlmphklftactrhydltmmtl"));
		Assert.assertEquals("wvsklbifgyccvvadimfxffxfmidavvccygfiblksvw",
				this.pali.minAdds("wvsklbifgyccvvadimfxffxfmidavvccygfib"));
		Assert.assertEquals("ogszbrdzkgttgkzdrbzsgo",
				this.pali.minAdds("ogszbrdzkgttgkzdrbzsg"));
		Assert.assertEquals("thrreplwfsvsfwlperrht",
				this.pali.minAdds("thrreplwfsvsfwl"));
		Assert.assertEquals(
				"faocdvvdmgpfzzfducxlikrjhbsxyhkacrwkharnaqqqqanrahkwrcakhyxsbhjrkilxcudfzzfpgmdvvdcoaf",
				this.pali.minAdds("faocdvvdmgpfzzfducxlikrjhbsxyhkacrwkharnaqqqqanra"));
		Assert.assertEquals("fcaxegypczzcpygexacf",
				this.pali.minAdds("fcaxegypczzcpy"));
		Assert.assertEquals("pypefvfepyp", this.pali.minAdds("pypefvfep"));
		Assert.assertEquals("bchhyijngruooefeoourgnjiyhhcb",
				this.pali.minAdds("bchhyijngruooefeoourgn"));
		Assert.assertEquals(
				"zebreejoosuncrmdlpxjrnjsmglhnytjkekgafhlyibiylhfagkekjtynhlgmsjnrjxpldmrcnusoojeerbez",
				this.pali.minAdds("zebreejoosuncrmdlpxjrnjsmglhnytjkekgafhlyibiylhfag"));
		Assert.assertEquals(
				"fusuabieseokwjsfuwzomfbqlqcxpxwwixqzbscppcsbzqxiwwxpxcqlqbfmozwufsjwkoeseibausuf",
				this.pali.minAdds("fusuabieseokwjsfuwzomfbqlqcxpxwwixqzbscppcsbzqxiww"));
		Assert.assertEquals("zaradspnbhiwaezzeawihbnpsdaraz",
				this.pali.minAdds("zaradspnbhiwaezzeaw"));
		Assert.assertEquals("blbftnqrkqcxoiyjjofspyzzypsfojjyioxcqkrqntfblb",
				this.pali.minAdds("blbftnqrkqcxoiyjjofspyzzypsfo"));
		Assert.assertEquals(
				"leqhifitcwkhfvtwryynevzpeiqqiepzvenyyrwtvfhkwctifihqel",
				this.pali.minAdds("leqhifitcwkhfvtwryynevzpeiqqiepzvenyyrwtvfhkwc"));
		Assert.assertEquals("lccwwhjzjsekefjgxxgjfekesjzjhwwccl",
				this.pali.minAdds("lccwwhjzjsekefjgxxgjf"));
		Assert.assertEquals(
				"zixxlfeyjtplwqvugbpzxtexhvxudljrbdnvezvzevndbrjlduxvhxetxzpbguvqwlptjyeflxxiz",
				this.pali.minAdds("zixxlfeyjtplwqvugbpzxtexhvxudljrbdnvezvzevndbrjld"));
		Assert.assertEquals(
				"taenhdefqpuwwgjmoxwdkkxnxxpqyhjhxsmigeyhqndbzwauuawzbdnqhyegimsxhjhyqpxxnxkkdwxomjgwwupqfedhneat",
				this.pali.minAdds("taenhdefqpuwwgjmoxwdkkxnxxpqyhjhxsmigeyhqndbzwauua"));
		Assert.assertEquals(
				"tnamglzfkopmrfrkdisulusvicggpkgvmiocgxfxrrxfxgcoimvgkpggcivsulusidkrfrmpokfzlgmant",
				this.pali.minAdds("tnamglzfkopmrfrkdisulusvicggpkgvmiocgxfxrrxfx"));
		Assert.assertEquals("ieluwjsonobzdoibslblsbiodzbonosjwulei",
				this.pali.minAdds("ieluwjsonobzdoibslbl"));
		Assert.assertEquals("mdujqrmoznyzozynzomrqjudm",
				this.pali.minAdds("mdujqrmoznyzo"));
		Assert.assertEquals("ysyzqkteljrepqxptyfqkuzzukqfytpxqperjletkqzysy",
				this.pali.minAdds("ysyzqkteljrepqxptyfqkuzzukqfytpxqper"));
		Assert.assertEquals(
				"gtlhptwszqicucwmmbchzuhiqklnsddqqsltdijvvtxuhfiifhuxtvvjidtlsqqddsnlkqihuzhcbmmwcuciqzswtphltg",
				this.pali.minAdds("gtlhptwszqicucwmmbchzuhiqklnsddqqsltdijvvtxuhfiif"));
		Assert.assertEquals(
				"ykrnbunmnmqhagzixnxapzgrprrprgzpaxnxizgahqmnmnubnrky",
				this.pali.minAdds("ykrnbunmnmqhagzixnxapzgrprrprgzpaxnxizgahqmnmnubnr"));
		Assert.assertEquals("xlnalvarbvvbravlanlx",
				this.pali.minAdds("xlnalvarbvvbravlanl"));
		Assert.assertEquals("tascoocsat", this.pali.minAdds("tascoocsa"));
		Assert.assertEquals("hjqgvlixqyhfwwocldjsbbsjdlcowwfhyqxilvgqjh",
				this.pali.minAdds("hjqgvlixqyhfwwocldjsbbsjdlcowwfhyqx"));
		Assert.assertEquals("zenxcyveazewufjfuwezaevycxnez",
				this.pali.minAdds("zenxcyveazewufjfuwezaevycxn"));
		Assert.assertEquals(
				"wvsuwunwarfstvvgtdwfrhxdmjbjmdxhrfwdtgvvtsfrawnuwusvw",
				this.pali.minAdds("wvsuwunwarfstvvgtdwfrhxdmjbjmdxhrfwdtgvvtsfrawnuw"));
		Assert.assertEquals(
				"frbibaivpihswtrluptitbunmjacjxeapkpkjwuxzwwmqktxbtbxtkqmwwzxuwjkpkpaexjcajmnubtitpulrtwshipviabibrf",
				this.pali.minAdds("frbibaivpihswtrluptitbunmjacjxeapkpkjwuxzwwmqktxbt"));
		Assert.assertEquals(
				"hbyxnzlkynagtkrkwprhggrqeiunagxffyfghuygkgyuhgfyffxganuieqrgghrpwkrktganyklznxybh",
				this.pali.minAdds("hbyxnzlkynagtkrkwprhggrqeiunagxffyfghuygk"));
		Assert.assertEquals("gukfcbdwdbcfkug", this.pali.minAdds("gukfcbdw"));
		Assert.assertEquals("srhhtdhanutovotunahdthhrs",
				this.pali.minAdds("srhhtdhanutov"));
		Assert.assertEquals("kjkxrduzgxscjsbmnqegzqrqzgeqnmbsjcsxgzudrxkjk",
				this.pali.minAdds("kjkxrduzgxscjsbmnqegzqr"));
		Assert.assertEquals(
				"rokidabyrlozrmvdpfdduwopfyqymsaeotehqykmreojycamxmacyjoermkyqhetoeasmyqyfpowuddfpdvmrzolrybadikor",
				this.pali.minAdds("rokidabyrlozrmvdpfdduwopfyqymsaeotehqykmreojycamx"));
		Assert.assertEquals(
				"avxsfzskfcapvvcrmtzgcqmwoowmqcgztmrcvvpacfkszfsxva",
				this.pali.minAdds("avxsfzskfcapvvcrmtzgcqmwoowmqcgztmrcvvpacfkszfsxva"));
		Assert.assertEquals("bopiposetkmjubehhaphblrcrlbhpahhebujmktesopipob",
				this.pali.minAdds("bopiposetkmjubehhaphblrcrlbhpahhebujmktesopipob"));
		Assert.assertEquals("xpcwjkqqkjwcpx", this.pali.minAdds("xpcwjkqqkjwcpx"));
		Assert.assertEquals("dcwuzzuwcd", this.pali.minAdds("dcwuzzuwcd"));
		Assert.assertEquals("dyaoyvameahjhaemavyoayd",
				this.pali.minAdds("dyaoyvameahjhaemavyoayd"));
		Assert.assertEquals(
				"dwdzrozjzjixjqmrumblzvglylgvzlbmurmqjxijzjzorzdwd",
				this.pali.minAdds("dwdzrozjzjixjqmrumblzvglylgvzlbmurmqjxijzjzorzdwd"));
		Assert.assertEquals(
				"hnakhtuvjmyjoqvoyqeazqfamccpgljgssjxxjssgjlgpccmafqzaeqyovqojymjvuthkanh",
				this.pali.minAdds("hnakhtuvjmyjoqvoyqeazqfamccpgljgssjxxjssgjlgpccmaf"));
		Assert.assertEquals("redocpotopcoder", this.pali.minAdds("redocpot"));
		Assert.assertEquals("adda", this.pali.minAdds("add"));
		Assert.assertEquals("ababbaba", this.pali.minAdds("ababba"));
		Assert.assertEquals("a", this.pali.minAdds("a"));
		Assert.assertEquals(
				"abcdefghijklmnopqrstuvwxyabcdefghijklmnopqrstuvwxyxwvutsrqponmlkjihgfedcbayxwvutsrqponmlkjihgfedcba",
				this.pali.minAdds("abcdefghijklmnopqrstuvwxyabcdefghijklmnopqrstuvwxy"));
		Assert.assertEquals("abcacba", this.pali.minAdds("abca"));
		Assert.assertEquals("abcdcba", this.pali.minAdds("abcdcb"));
		Assert.assertEquals("abcba", this.pali.minAdds("abc"));
		Assert.assertEquals("adbbda", this.pali.minAdds("adbbd"));
		Assert.assertEquals(
				"fgwlehfasdkjlhcewhfkewhfkhfkljdshkldshfkldhlksklhdlkfhsdlkhsdjlkfhkfhwekfhwechljkdsafhelwgf",
				this.pali.minAdds("fgwlehfasdkjlhcewhfkewhfkhfkljdshkldshfkldhlks"));
		Assert.assertEquals("abbacabba", this.pali.minAdds("abbacabba"));
		Assert.assertEquals("abcdeffedcba", this.pali.minAdds("abcdeff"));
		Assert.assertEquals("aaabaaa", this.pali.minAdds("aaab"));
		Assert.assertEquals("adddda", this.pali.minAdds("adddd"));
		Assert.assertEquals("araara", this.pali.minAdds("araa"));
	}
}
