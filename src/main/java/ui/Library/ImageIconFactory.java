/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Library;

import javax.swing.ImageIcon;

/**
 *
 * @author zili Chen
 */
public class ImageIconFactory {/*图标集合*/
    
    private String p;
    
    /*教务系统图标*/
    public ImageIconFactory() {
        p = new PicturePath().getPath();
    }
    
    public ImageIcon getJTwoDocIcon() {
        return new ImageIcon(p+"1.png");
    }
    
    public ImageIcon getJFileIcon() {
        return new ImageIcon(p+"2.png");
    }
    
    public ImageIcon getJListIcon() {
        return new ImageIcon(p+"3.png");
    }
    
    public ImageIcon getJFileBookIcon() {
        return new ImageIcon(p+"4.png");
    }
    
    public ImageIcon getJRecycleIcon() {
        return new ImageIcon(p+"5.png");
    }
    
    public ImageIcon getJThreeBookIcon() {
        return new ImageIcon(p+"6.png");
    }
    
    public ImageIcon getJOpenBookIcon() {
        return new ImageIcon(p+"7.png");
    }
    
    public ImageIcon getJCheckIcon() {
        return new ImageIcon(p+"8.png");
    }
    
    public ImageIcon getJPencilIcon() {
        return new ImageIcon(p+"9.png");
    }
    
    public ImageIcon getJTwoPenIcon() {
        return new ImageIcon(p+"10.png");
    }
    
    public ImageIcon getJPersonIcon() {
        return new ImageIcon(p+"11.png");
    }
    
    public ImageIcon getJManyPerIcon() {
        return new ImageIcon(p+"12.png");
    }
    
    public ImageIcon getJModifyIcon() {
        return new ImageIcon(p+"13.png");
    }
    
    public ImageIcon getJBooksIcon() {
        return new ImageIcon(p+"14.png");
    }
    
    public ImageIcon getJGlassIcon() {
        return new ImageIcon(p+"15.png");
    }
    
    public ImageIcon getJCycleIcon() {
        return new ImageIcon(p+"16.png");
    }
    
    public ImageIcon getJSettingIcon() {
        return new ImageIcon(p+"17.png");
    }
    
    public ImageIcon getJPenIcon() {
        return new ImageIcon(p+"18.png");
    }
    
    /*按钮图标*/
    public ImageIcon getLLeftArrowIcon() {
        return new ImageIcon(p+"Lbackto.gif");
    }
    
    public ImageIcon getLCancelIcon() {
        return new ImageIcon(p+"Lcancel.gif");
    }
    
    public ImageIcon getLCloseIcon() {
        return new ImageIcon(p+"Lclose.gif");
    }
    
    public ImageIcon getLDiaplusIcon() {
        return new ImageIcon(p+"Ldiaplus.gif");
    }
    
    public ImageIcon getLExitIcon() {
        return new ImageIcon(p+"Lexit.gif");
    }
    
    public ImageIcon getLHomeIcon() {
        return new ImageIcon(p+"Lhome.gif");
    }
    
    public ImageIcon getLHelpIcon() {
        return new ImageIcon(p+"LloginHelp.gif");
    }
    
    public ImageIcon getLLoginIcon() {
        return new ImageIcon(p+"LloginLogin.gif");
    }
    
    public ImageIcon getLPenMofityIcon() {
        return new ImageIcon(p+"Lmodify.gif");
    }
    
    public ImageIcon getLNextIcon() {
        return new ImageIcon(p+"Lnext.gif");
    }
    
    public ImageIcon getLNoteIcon() {
        return new ImageIcon(p+"Lnote.gif");
    }
    
    public ImageIcon getLPlusIcon() {
        return new ImageIcon(p+"Lplus.gif");
    }
    
    public ImageIcon getLReplaceIcon() {
        return new ImageIcon(p+"Lreplace.gif");
    }
    
    public ImageIcon getLSearchIcon() {
        return new ImageIcon(p+"Lsearch.gif");
    }
    
    public ImageIcon getLSetIcon() {
        return new ImageIcon(p+"Lset.gif");
    }
    
    public ImageIcon getLShareIcon() {
        return new ImageIcon(p+"Lshare.gif");
    }
    
    public ImageIcon getLYesIcon() {
        return new ImageIcon(p+"Lyes.gif");
    }
    
    public ImageIcon getLCreditIcon() {
        return new ImageIcon(p+"Lcredit.gif");
    }
    
    public ImageIcon getLDeleteIcon() {
        return new ImageIcon(p+"Ldelete.gif");
    }
    
    public ImageIcon getLRefreshIcon() {
        return new ImageIcon(p+"Lrefresh.gif");
    }
    
    public ImageIcon getLOpenIcon() {
        return new ImageIcon(p+"Lopen.gif");
    }
    
    /*文字图标*/
    public ImageIcon getPAddUserIcon() {
        return new ImageIcon(p+"PaddUser.gif");
    }
    
    public ImageIcon getPAllCourseIcon() {
        return new ImageIcon(p+"PallCourse.gif");
    }
    
    public ImageIcon getPCourseInfoIcon() {
        return new ImageIcon(p+"PcourseInfo.gif");
    }
    
    public ImageIcon getPCreditIcon() {
        return new ImageIcon(p+"Pcredit.gif");
    }
    
    public ImageIcon getPDeleteUserIcon() {
        return new ImageIcon(p+"PdeleteUser.gif");
    }
    
    public ImageIcon getPDescribeIcon() {
        return new ImageIcon(p+"Pdescribe.gif");
    }
    
    public ImageIcon getPFrameIcon() {
        return new ImageIcon(p+"Pframe.gif");
    }
    
    public ImageIcon getPGradeIcon() {
        return new ImageIcon(p+"Pgrade.gif");
    }
    
    public ImageIcon getPKeyIcon() {
        return new ImageIcon(p+"Pkey.gif");
    }
    
    public ImageIcon getPModifyInfoIcon() {
        return new ImageIcon(p+"PmodifyInfo.gif");
    }
    
    public ImageIcon getPModifyNoteIcon() {
        return new ImageIcon(p+"PmodifyNote.gif");
    }
    
    public ImageIcon getPCourseIcon() {
        return new ImageIcon(p+"PCourse.gif");
    }
    
    public ImageIcon getPTermIcon() {
        return new ImageIcon(p+"PTerm.gif");
    }
    
    public ImageIcon getPNoteIcon() {
        return new ImageIcon(p+"PnoteT.gif");
    }
    
    public ImageIcon getPPerInfoIcon() {
        return new ImageIcon(p+"PperInfo.gif");
    }
    
    public ImageIcon getPPlanIcon() {
        return new ImageIcon(p+"Pplan.gif");
    }
    
    public ImageIcon getPProcessIcon() {
        return new ImageIcon(p+"Pprocess.gif");
    }
    
    public ImageIcon getPSelectIcon() {
        return new ImageIcon(p+"Pselect.gif");
    }
    
    public ImageIcon getPStaticsIcon() {
        return new ImageIcon(p+"Pstatics.gif");
    }
    
    public ImageIcon getPViewCourseIcon() {
        return new ImageIcon(p+"Pviewcourse.gif");
    }
    
    public ImageIcon getPViewInfoIcon() {
        return new ImageIcon(p+"PviewInfo.gif");
    }
    
    public ImageIcon getPViewstuIcon() {
        return new ImageIcon(p+"Pviewstu.gif");
    }
    
    public ImageIcon getPCreateModelIcon() {
        return new ImageIcon(p+".gif");
    }
    
    public ImageIcon getPPublishModelIcon() {
        return new ImageIcon(p+".gif");
    }
    
    public ImageIcon getPCheckIcon() {
        return new ImageIcon(p+".gif");
    }
    
    public ImageIcon getPSureIcon() {
        return new ImageIcon(p+".gif");
    }
    
    public ImageIcon getPNewMIcon() {
        return new ImageIcon(p+".gif");
    }
    
    public ImageIcon getPCancelIcon() {
        return new ImageIcon(p+".gif");
    }
    
    public ImageIcon getPTimeIcon() {
        return new ImageIcon(p+"Ptime.gif");
    }
    
    public ImageIcon getPNoticeIcon() {
        return new ImageIcon(p+"Pnotice.gif");
    }
    
    public ImageIcon getPTongshiIcon() {
        return new ImageIcon(p+"Ptongshi.gif");
    }
    
    /*登录小人*/
    public ImageIcon getTadmIcon() {
        return new ImageIcon(p+"Tadm.gif");
    }
    
    public ImageIcon getTadm2Icon() {
        return new ImageIcon(p+"Tadm2.gif");
    }
    
    public ImageIcon getTjwIcon() {
        return new ImageIcon(p+"Tjw.gif");
    }
    
    public ImageIcon getTjw2Icon() {
        return new ImageIcon(p+"Tjw2.gif");
    }
    
    public ImageIcon getTstuIcon() {
        return new ImageIcon(p+"Tstu.gif");
    }
    
    public ImageIcon getTstu2Icon() {
        return new ImageIcon(p+"Tstu2.gif");
    }
    
    public ImageIcon getTyjwIcon() {
        return new ImageIcon(p+"Tyjw.gif");
    }
    
    public ImageIcon getTyjw2Icon() {
        return new ImageIcon(p+"Tyjw2.gif");
    }
    
    public ImageIcon getTteaIcon() {
        return new ImageIcon(p+"Ttea.gif");
    }
    
    public ImageIcon getTtea2Icon() {
        return new ImageIcon(p+"Ttea2.gif");
    }
    
    /*其他*/
    public ImageIcon getBbackroundIcon() {
        return new ImageIcon(p+"Bbackround.gif");
    }
    
    public ImageIcon getBloginbackIcon() {
        return new ImageIcon(p+"Bloginback.gif");
    }
    
    public ImageIcon getBnavigationIcon() {
        return new ImageIcon(p+"Bnavigation.gif");
    }
    
    public ImageIcon getBmodelbackIcon() {
        return new ImageIcon(p+"Bmodelback.jpg");
    }
    
}
