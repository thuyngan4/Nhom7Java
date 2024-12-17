package quanlydienthoai.views.admin;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

import quanlydienthoai.Controller.AccountController;
import quanlydienthoai.Controller.AccountFileController;
import quanlydienthoai.Models.Account;
import quanlydienthoai.views.Login;

public class UsersManagement extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Creates new form UsersManagement
	 */
	public UsersManagement() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(UsersManagement.class.getResource("/quanlynhadat/views/icons/phone-call-icon.png")));
		initComponents();
	}

	@SuppressWarnings("serial")
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		tbUser = new javax.swing.JTable();
		jLabel2 = new javax.swing.JLabel();
		jLabel2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtId = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jLabel3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtUsername = new javax.swing.JTextField();
		btnExit = new javax.swing.JButton();
		btnExit.setIcon(
				new ImageIcon(UsersManagement.class.getResource("/quanlynhadat/views/icons/logout-icon-16.png")));
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtName = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		jLabel4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAdd = new javax.swing.JButton();
		btnAdd.setIcon(new ImageIcon(UsersManagement.class
				.getResource("/quanlynhadat/views/icons/10207-man-student-light-skin-tone-icon-16.png")));
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEdit = new javax.swing.JButton();
		btnEdit.setIcon(new ImageIcon(
				UsersManagement.class.getResource("/quanlynhadat/views/icons/Actions-document-edit-icon-16.png")));
		btnEdit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnDelete = new javax.swing.JButton();
		btnDelete.setIcon(new ImageIcon(
				UsersManagement.class.getResource("/quanlynhadat/views/icons/Actions-edit-delete-icon-16.png")));
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 12));
		jLabel6 = new javax.swing.JLabel();
		jLabel6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtPassword = new javax.swing.JPasswordField();
		jLabel9 = new javax.swing.JLabel();
		jLabel9.setIcon(
				new ImageIcon(UsersManagement.class.getResource("/quanlynhadat/views/icons/search-icon-16.png")));
		jLabel9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtSearch = new javax.swing.JTextField();
		btnExport = new javax.swing.JButton();
		btnExport.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnImport = new javax.swing.JButton();
		btnImport.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnShowTransactions = new javax.swing.JButton();
		btnShowTransactions.setFont(new Font("Tahoma", Font.PLAIN, 12));
		jPanel1 = new javax.swing.JPanel();
		lbStatusCaps = new javax.swing.JLabel();
		lbDate = new javax.swing.JLabel();
		lbTime = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		miNew = new javax.swing.JMenuItem();
		jSeparator1 = new javax.swing.JPopupMenu.Separator();
		miExit = new javax.swing.JMenuItem();
		jMenu3 = new javax.swing.JMenu();
		jMenuItem2 = new javax.swing.JMenuItem();
		jMenuItem4 = new javax.swing.JMenuItem();
		jMenu4 = new javax.swing.JMenu();
		jMenuItem3 = new javax.swing.JMenuItem();
		jMenuItem5 = new javax.swing.JMenuItem();
		jMenuItem6 = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("QUẢN LÝ NHÂN VIÊN");
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowOpened(java.awt.event.WindowEvent evt) {
				formWindowOpened(evt);
			}
		});

		tbUser.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "STT", "ID", "Họ tên", "Tên người dùng", "Vai trò", "Trạng thái" }) {
			boolean[] canEdit = new boolean[] { false, false, false, false, false, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		tbUser.getTableHeader().setResizingAllowed(false);
		tbUser.getTableHeader().setReorderingAllowed(false);
		tbUser.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				tbUserMouseClicked(evt);
			}
		});
		jScrollPane1.setViewportView(tbUser);
		if (tbUser.getColumnModel().getColumnCount() > 0) {
			tbUser.getColumnModel().getColumn(0).setMinWidth(35);
			tbUser.getColumnModel().getColumn(0).setPreferredWidth(35);
			tbUser.getColumnModel().getColumn(0).setMaxWidth(30);
			tbUser.getColumnModel().getColumn(1).setMinWidth(35);
			tbUser.getColumnModel().getColumn(1).setPreferredWidth(35);
			tbUser.getColumnModel().getColumn(1).setMaxWidth(30);
			tbUser.getColumnModel().getColumn(4).setMinWidth(80);
			tbUser.getColumnModel().getColumn(4).setPreferredWidth(80);
			tbUser.getColumnModel().getColumn(4).setMaxWidth(80);
		}

		jLabel2.setText("ID :  ");

		txtId.setEditable(false);
		txtId.setEnabled(false);

		jLabel3.setText("User Name :");

		btnExit.setText("Back to Admin homepage");
		btnExit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnExitActionPerformed(evt);
			}
		});

		jLabel4.setText("Full Name :");

		btnAdd.setText("Add new");
		btnAdd.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnAddActionPerformed(evt);
			}
		});

		btnEdit.setText("Edit\r\n");
		btnEdit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnEditActionPerformed(evt);
			}
		});

		btnDelete.setText("Delete");
		btnDelete.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnDeleteActionPerformed(evt);
			}
		});

		jLabel6.setText("Password :");

		txtPassword.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtPasswordActionPerformed(evt);
			}
		});

		jLabel9.setText("Search by name:");

		txtSearch.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtSearchActionPerformed(evt);
			}
		});
		txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				txtSearchKeyPressed(evt);
			}
		});

		btnExport.setBackground(new Color(192, 192, 192));
		btnExport.setText("Export data");
		btnExport.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnExportActionPerformed(evt);
			}
		});

		btnImport.setBackground(new Color(192, 192, 192));
		btnImport.setText("Enter data");
		btnImport.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnImportActionPerformed(evt);
			}
		});

		btnShowTransactions.setText("View completed transactions");
		btnShowTransactions.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnShowTransactionsActionPerformed(evt);
			}
		});

		jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

		lbStatusCaps.setText("CAPS");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(lbTime)
						.addGap(48, 48, 48).addComponent(lbDate).addGap(29, 29, 29).addComponent(lbStatusCaps,
								javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lbStatusCaps, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(lbDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(lbTime, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
								javax.swing.GroupLayout.PREFERRED_SIZE)));

		jPanel2.setBackground(new Color(192, 192, 192));

		jLabel1.setFont(new Font("Segoe UI", Font.BOLD, 24)); // NOI18N
		jLabel1.setForeground(new Color(0, 0, 0));
		jLabel1.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/quanlynhadat/views/icons/Person-Male-Light-icon-24.png"))); // NOI18N
		jLabel1.setText("USER ACCOUNT MANAGEMENT");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, jPanel2Layout.createSequentialGroup().addGap(157).addComponent(jLabel1)
						.addContainerGap(191, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout
				.createSequentialGroup().addGap(19).addComponent(jLabel1).addContainerGap(28, Short.MAX_VALUE)));
		jPanel2.setLayout(jPanel2Layout);

		jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlynhadat/views/icons/home2.png"))); // NOI18N
		jMenu1.setMnemonic('H');
		jMenu1.setText("System");

		miNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlynhadat/views/icons/new.png"))); // NOI18N
		miNew.setMnemonic('N');
		miNew.setText("Trang chủ");
		miNew.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				miNewActionPerformed(evt);
			}
		});
		jMenu1.add(miNew);
		jMenu1.add(jSeparator1);

		miExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W,
				java.awt.event.InputEvent.CTRL_DOWN_MASK));
		miExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlynhadat/views/icons/logout.png"))); // NOI18N
		miExit.setMnemonic('L');
		miExit.setText("Log out");
		miExit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				miExitActionPerformed(evt);
			}
		});
		jMenu1.add(miExit);

		jMenuBar1.add(jMenu1);

		jMenu3.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/quanlynhadat/views/icons/Person-Male-Light-icon-24.png"))); // NOI18N
		jMenu3.setText("User account management");

		jMenuItem2.setText("Danh sách người dùng");
		jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem2ActionPerformed(evt);
			}
		});
		jMenu3.add(jMenuItem2);

		jMenuItem4.setText("Thêm nhân viên");
		jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem4ActionPerformed(evt);
			}
		});
		jMenu3.add(jMenuItem4);

		jMenuBar1.add(jMenu3);

		jMenu4.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/quanlynhadat/views/icons/Actions-view-choose-icon-24.png"))); // NOI18N
		jMenu4.setText("Revenue");

		jMenuItem3.setText("Tất cả doanh thu");
		jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem3ActionPerformed(evt);
			}
		});
		jMenu4.add(jMenuItem3);

		jMenu4.add(jMenuItem5);

		jMenu4.add(jMenuItem6);

		jMenuBar1.add(jMenu4);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addGap(30)
				.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnAdd, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addGroup(layout.createSequentialGroup()
								.addComponent(btnEdit, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
								.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(jLabel3)
										.addComponent(jLabel4).addComponent(jLabel6).addComponent(jLabel2))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(txtUsername, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 120,
												Short.MAX_VALUE)
										.addComponent(txtName, Alignment.LEADING).addComponent(txtId, Alignment.LEADING)
										.addComponent(txtPassword)))
						.addComponent(btnShowTransactions, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE))
				.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(layout.createSequentialGroup().addGap(419).addComponent(txtSearch,
								GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addGap(18).addGroup(layout
								.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
								.addGroup(layout.createSequentialGroup().addComponent(btnImport).addGap(18)
										.addComponent(btnExport)
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(jLabel9).addGap(95))
								.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 493,
										GroupLayout.PREFERRED_SIZE))))
				.addContainerGap(30, Short.MAX_VALUE))
				.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)
				.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
								.addGap(11).addGroup(layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnExport).addComponent(btnImport)
										.addComponent(txtSearch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)))
								.addGroup(layout.createSequentialGroup().addGap(18).addComponent(jLabel9)))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(
								layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel2)
												.addComponent(txtId, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGap(18)
										.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel4)
												.addComponent(txtName, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGap(18)
										.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel3)
												.addComponent(txtUsername, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGap(18)
										.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel6)
												.addComponent(txtPassword, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGap(31)
										.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(btnEdit)
												.addComponent(btnDelete))
										.addGap(18).addComponent(btnAdd).addGap(18).addComponent(btnShowTransactions)
										.addGap(18, 102, Short.MAX_VALUE))
										.addGroup(layout.createSequentialGroup()
												.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 0,
														Short.MAX_VALUE)
												.addPreferredGap(ComponentPlacement.RELATED)))
						.addComponent(btnExit).addGap(18).addComponent(jPanel1, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)));
		getContentPane().setLayout(layout);

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void formWindowOpened(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowOpened
		isCapsOn = Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK);
		lbStatusCaps.setEnabled(isCapsOn);

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat simpleTimeFormat = new SimpleDateFormat("HH:mm:ss");

		Calendar calendar = Calendar.getInstance();
		Date currentTime = calendar.getTime();
		lbDate.setText(simpleDateFormat.format(currentTime));
		lbTime.setText(simpleTimeFormat.format(currentTime));

		timerNow = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Calendar calendar = Calendar.getInstance();
				Date currentTime = calendar.getTime();
				lbTime.setText(simpleTimeFormat.format(currentTime));
			}
		});
		timerNow.start();

		List<Account> accounts = List.copyOf(AccountController.getAllAccount());

		DefaultTableModel model = (DefaultTableModel) tbUser.getModel();
		int stt = 0;
		for (int i = 0; i < accounts.size(); i++) {
			Account account = accounts.get(i);
			if (account.getRole_id() != 1) {
				stt++;
				model.addRow(new Object[] { stt, account.getId(), account.getFullname(), account.getUsername(),
						"Nhân viên", account.getStatus() });
			}
		}
	}// GEN-LAST:event_formWindowOpened

	private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnExitActionPerformed
		this.dispose();
		AdminScreenMain adminScreenMain = new AdminScreenMain();
		adminScreenMain.setVisible(true);
	}// GEN-LAST:event_btnExitActionPerformed

	private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAddActionPerformed
		this.dispose();
		AddUserFrame addUserFrame = new AddUserFrame();
		addUserFrame.setVisible(true);
	}// GEN-LAST:event_btnAddActionPerformed

	private void tbUserMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tbUserMouseClicked
		DefaultTableModel tableModel = (DefaultTableModel) tbUser.getModel();
		@SuppressWarnings("unchecked")
		Vector<Object> accountVector = (Vector<Object>) tableModel.getDataVector().elementAt(tbUser.getSelectedRow());

		Account account = AccountController.getAccountByID(Integer.parseInt(accountVector.get(1).toString()));

		txtId.setText(account.getId() + "");
		txtName.setText(account.getFullname());
		txtUsername.setText(account.getUsername());
		txtPassword.setText(account.getPassword());
	}// GEN-LAST:event_tbUserMouseClicked

	private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnEditActionPerformed
		if (txtId.getText().trim().compareTo("") == 0) {
			JOptionPane.showConfirmDialog(null, "Chưa có nhân viên nào được chọn!", "Cảnh báo",
					JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
			return;
		}
		if (txtName.getText().trim().compareTo("") == 0) {
			JOptionPane.showConfirmDialog(null, "Họ tên không được để trống", "Sửa tài khoản",
					JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
			return;
		}
		if (txtUsername.getText().trim().compareTo("") == 0) {
			JOptionPane.showConfirmDialog(null, "Tên đăng nhập không được để trống", "Sửa tài khoản",
					JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
			return;
		}
		if (String.valueOf(txtPassword.getPassword()).trim().compareTo("") == 0) {
			JOptionPane.showConfirmDialog(null, "Mật khẩu không được để trống", "Sửa tài khoản",
					JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
			return;
		}
		if (String.valueOf(txtPassword.getPassword()).length() < 8) {
			JOptionPane.showConfirmDialog(null, "Mật khẩu phải có ít nhất 8 ký tự", "Sửa tài khoản",
					JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
			return;
		}

		Account account = new Account();
		account.setId(Integer.parseInt(txtId.getText()));
		account.setFullname(txtName.getText());
		account.setUsername(txtUsername.getText());
		account.setPassword(String.valueOf(txtPassword.getPassword()));

		int responseConfirm = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn sửa thông tin nhân viên không?",
				"Sửa tài khoản", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (responseConfirm == JOptionPane.YES_OPTION) {
			if (!AccountController.updateAccount(account)) {
				JOptionPane.showConfirmDialog(null, "Sửa thông tin tài khoản thất bại", "Sửa tài khoản",
						JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
				return;
			}
			JOptionPane.showConfirmDialog(null, "Sửa thông tin tài khoản thành công", "Sửa tài khoản",
					JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
		}
		DefaultTableModel model = (DefaultTableModel) tbUser.getModel();
		model.setRowCount(0);
		formWindowOpened(null);

	}// GEN-LAST:event_btnEditActionPerformed

	private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDeleteActionPerformed
		if (txtId.getText().trim().compareTo("") == 0) {
			JOptionPane.showConfirmDialog(null, "Chưa có nhân viên nào được chọn!", "Cảnh báo",
					JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
			return;
		}
		int responseConfirm = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa không?", "Xóa tài khoản",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (responseConfirm == JOptionPane.YES_OPTION) {
			boolean status = false;
			if (!AccountController.deleteAccount(Integer.parseInt(txtId.getText()), status)) {
				JOptionPane.showConfirmDialog(null, "Xóa tài khoản thất bại", "Xóa tài khoản",
						JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
				return;
			}
			JOptionPane.showConfirmDialog(null, "Xóa tài khoản thành công", "Xóa tài khoản", JOptionPane.DEFAULT_OPTION,
					JOptionPane.INFORMATION_MESSAGE);
			DefaultTableModel model = (DefaultTableModel) tbUser.getModel();
			model.setRowCount(0);
			formWindowOpened(null);
		}
	}// GEN-LAST:event_btnDeleteActionPerformed

	// tìm kiếm theo tên
	private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtSearchKeyPressed
		if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
			if (txtSearch.getText().trim().compareTo("") == 0) {
				DefaultTableModel model = (DefaultTableModel) tbUser.getModel();
				model.setRowCount(0);

				List<Account> accounts = AccountController.getAllAccount();

				int stt = 0;
				for (int i = 0; i < accounts.size(); i++) {
					Account account = accounts.get(i);
					if (account.getRole_id() != 1) {
						stt++;
						model.addRow(new Object[] { stt, account.getId(), account.getFullname(), account.getUsername(),
								"Nhân viên", account.getStatus() });
					}
				}
			} else {
				DefaultTableModel model = (DefaultTableModel) tbUser.getModel();
				model.setRowCount(0);

				List<Account> accounts = AccountController.getAccountsLikeUsername(txtSearch.getText().trim());

				int stt = 0;
				for (int i = 0; i < accounts.size(); i++) {
					Account account = accounts.get(i);
					if (account.getRole_id() != 1) {
						stt++;
						model.addRow(new Object[] { stt, account.getId(), account.getFullname(), account.getUsername(),
								"Nhân viên", account.getStatus() });
					}
				}
			}
		}
	}// GEN-LAST:event_txtSearchKeyPressed

	private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtSearchActionPerformed
	}// GEN-LAST:event_txtSearchActionPerformed

	private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnExportActionPerformed
		int responseConfirm = JOptionPane.showConfirmDialog(null,
				"Bạn có chắc chắn xuất dữ liệu tài khoản người dùng không?", "Xuất dữ liệu", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE);
		if (responseConfirm == JOptionPane.YES_OPTION) {
			AccountFileController.SqlToFile();
			JOptionPane.showConfirmDialog(null,
					"Xuất thành công. Dữ liệu tài khoản người dùng đã được mã hóa và lưu lại trong file 'ACCOUNT.txt'",
					"Xuất dữ liệu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
			DefaultTableModel model = (DefaultTableModel) tbUser.getModel();
			model.setRowCount(0);
			formWindowOpened(null);
		} else {
			JOptionPane.showConfirmDialog(null, "Xuất thất bại.", "Xuất dữ liệu", JOptionPane.DEFAULT_OPTION,
					JOptionPane.ERROR_MESSAGE);
		}
	}// GEN-LAST:event_btnExportActionPerformed

	private void btnImportActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnImportActionPerformed
		int responseConfirm = JOptionPane.showConfirmDialog(null,
				"Bạn có chắc chắn nhập dữ liệu từ file 'ACCOUNT.txt' không?", "Nhập dữ liệu", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE);
		if (responseConfirm == JOptionPane.YES_OPTION) {
			AccountFileController.FileToSql();
			JOptionPane.showConfirmDialog(null, "Nhập thành công.", "Nhập dữ liệu", JOptionPane.DEFAULT_OPTION,
					JOptionPane.INFORMATION_MESSAGE);
			DefaultTableModel model = (DefaultTableModel) tbUser.getModel();
			model.setRowCount(0);
			formWindowOpened(null);
		} else {
			JOptionPane.showConfirmDialog(null, "Nhập thất bại.", "Nhập dữ liệu", JOptionPane.DEFAULT_OPTION,
					JOptionPane.ERROR_MESSAGE);
		}
	}// GEN-LAST:event_btnImportActionPerformed

	private void btnShowTransactionsActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnShowTransactionsActionPerformed
		if (txtId.getText().trim().compareTo("") == 0) {
			JOptionPane.showConfirmDialog(null, "Chưa có nhân viên nào được chọn!", "Cảnh báo",
					JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
			return;
		}
		this.dispose();
		RevenueByUserFrame frame = new RevenueByUserFrame(new javax.swing.JFrame(), true, txtId.getText());
		frame.setVisible(true);
	}// GEN-LAST:event_btnShowTransactionsActionPerformed

	private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtPasswordActionPerformed
	}// GEN-LAST:event_txtPasswordActionPerformed

	private void miExitActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_miExitActionPerformed

		this.dispose();
		Login login = new Login();
		login.setVisible(true);
	}// GEN-LAST:event_miExitActionPerformed

	private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem2ActionPerformed

	}// GEN-LAST:event_jMenuItem2ActionPerformed

	private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem4ActionPerformed
		this.dispose();
		AddUserFrame addUserFrame = new AddUserFrame();
		addUserFrame.setVisible(true);
	}// GEN-LAST:event_jMenuItem4ActionPerformed

	private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem3ActionPerformed
		this.dispose();
//        TransactionsRevenueFrame dialog = new TransactionsRevenueFrame(new javax.swing.JFrame(), true);
//        dialog.setVisible(true);
	}// GEN-LAST:event_jMenuItem3ActionPerformed

	@SuppressWarnings("unused")
	private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem5ActionPerformed
		this.dispose();
//        LandTransactionsRevenueFrame dialog = new LandTransactionsRevenueFrame(new javax.swing.JFrame(), true);
//        dialog.setVisible(true);
	}// GEN-LAST:event_jMenuItem5ActionPerformed

	@SuppressWarnings("unused")
	private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem6ActionPerformed
		this.dispose();
//        HomeTransactionsRevenueFrame dialog = new HomeTransactionsRevenueFrame(new javax.swing.JFrame(), true);
//        dialog.setVisible(true);
	}// GEN-LAST:event_jMenuItem6ActionPerformed

	private void miNewActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_miNewActionPerformed
		this.dispose();
		AdminScreenMain dialog = new AdminScreenMain();
		dialog.setVisible(true);
	}// GEN-LAST:event_miNewActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(UsersManagement.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(UsersManagement.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(UsersManagement.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(UsersManagement.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new UsersManagement().setVisible(true);
			}
		});
	}

	private boolean isCapsOn;
	private Timer timerNow;
	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnAdd;
	private javax.swing.JButton btnDelete;
	private javax.swing.JButton btnEdit;
	private javax.swing.JButton btnExit;
	private javax.swing.JButton btnExport;
	private javax.swing.JButton btnImport;
	private javax.swing.JButton btnShowTransactions;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu3;
	private javax.swing.JMenu jMenu4;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem2;
	private javax.swing.JMenuItem jMenuItem3;
	private javax.swing.JMenuItem jMenuItem4;
	private javax.swing.JMenuItem jMenuItem5;
	private javax.swing.JMenuItem jMenuItem6;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JPopupMenu.Separator jSeparator1;
	private javax.swing.JLabel lbDate;
	private javax.swing.JLabel lbStatusCaps;
	private javax.swing.JLabel lbTime;
	private javax.swing.JMenuItem miExit;
	private javax.swing.JMenuItem miNew;
	private javax.swing.JTable tbUser;
	private javax.swing.JTextField txtId;
	private javax.swing.JTextField txtName;
	private javax.swing.JPasswordField txtPassword;
	private javax.swing.JTextField txtSearch;
	private javax.swing.JTextField txtUsername;
	// End of variables declaration//GEN-END:variables
}