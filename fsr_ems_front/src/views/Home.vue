<template>
  <div class="system">
    <el-card class="title" shadow="always">
      <p class="name">見積書自動生成システム</p>
    </el-card>

    <!-- 一般情報の入力フォーム -->
    <el-card class="info" shadow="always">
      <el-form
        :model="infoForm"
        :rules="rules1"
        ref="infoForm"
        label-width="100px"
        class="info-infoForm"
      >
        <el-form-item label="客先会社名" prop="customer">
          <el-col :span="8">
            <el-input v-model="infoForm.customer"></el-input>
          </el-col>
        </el-form-item>
        <el-form-item label="見積番号" prop="estimate">
          <el-col :span="8">
            <el-input
              v-model.number="infoForm.estimate"
              placeholder="見積番号の日付を入力してください"
            ></el-input>
          </el-col>
        </el-form-item>
        <el-form-item label="社名" prop="company">
          <el-col :span="8">
            <el-select
              v-model="infoForm.company"
              placeholder="社名を選択してください"
            >
              <el-option label="FSR株式会社" value="shanghai"></el-option>
              <el-option label="ibm株式会社" value="beijing"></el-option>
            </el-select>
          </el-col>
        </el-form-item>
        <el-form-item label="備考" prop="desc">
          <el-input type="textarea" v-model="infoForm.desc"></el-input>
        </el-form-item>
      </el-form>
    </el-card>

    <!-- 作業者 -->
    <div class="employee">
      <el-button style="height: 70%" type="primary" @click="handleAdd">
        ＋　新規
      </el-button>
      <el-dialog
        title="作業者情報"
        :visible.sync="dialogVisible"
        width="70%"
        :before-close="handleClose"
      >
        <!-- 作業者情報のフォーム -->
        <el-form
          ref="employeeForm"
          :rules="rules2"
          :inline="true"
          :model="employeeForm"
          label-width="150px"
        >
          <el-form-item label="氏名" prop="name">
            <el-input v-model="employeeForm.name"></el-input>
          </el-form-item>
          <el-form-item label="月数" prop="months">
            <el-input v-model.number="employeeForm.months"></el-input>
          </el-form-item>
          <el-form-item label="基本金額" prop="basic">
            <el-input v-model="employeeForm.basic"></el-input> </el-form-item
          ><br />
          <el-form-item label="基準時間（上限）" prop="upper_limit">
            <el-input v-model.number="employeeForm.upper_limit"></el-input>
          </el-form-item>
          <el-form-item label="基準時間（下限）" prop="lower_limit">
            <el-input v-model.number="employeeForm.lower_limit"></el-input>
          </el-form-item>
          <el-form-item label="作業開始日付" prop="start">
            <el-date-picker
              v-model="employeeForm.start"
              type="date"
              value-format="yyyy-MM-DD"
            >
            </el-date-picker>
          </el-form-item>
        </el-form>
      </el-dialog>
      <div class="employee-table">
        <el-table stripe height="90%" :data="tableData" style="width: 100%">
          <el-table-column prop="name" label="氏名"> </el-table-column>
          <el-table-column prop="months" label="月数"> </el-table-column>
          <el-table-column prop="basic" label="基本金額"> </el-table-column>
          <el-table-column prop="over" label="超過単価"> </el-table-column>
          <el-table-column prop="deduction" label="控除単価"> </el-table-column>
          <el-table-column prop="limit" label="基準時間">
            <el-table-column prop="upper_limit" label="上限" width="60">
            </el-table-column>
            <el-table-column prop="lower_limit" label="下限" width="60">
            </el-table-column>
          </el-table-column>
          <el-table-column prop="work" label="作業期間">
            <el-table-column prop="start" label="開始" width="120">
            </el-table-column>
            <el-table-column prop="finish" label="終了" width="120">
            </el-table-column>
          </el-table-column>
          <el-table-column prop="tips" label="備考"> </el-table-column>
        </el-table>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      dialogVisible: false,
      infoForm: {
        customer: "",
        estimate: "",
        company: "",
        desc: "",
      },
      employeeForm: {
        name: "",
        months: "",
        basic: "",
      },
      rules1: {
        customer: [
          {
            required: true,
            message: "提出先の会社名を入力してください",
          },
          {
            min: 3,
            max: 100,
            message: "长度在 3 到 100 个字符",
          },
        ],
        estimate: [
          {
            required: true,
            message: "見積番号の日付を入力してください",
          },
          {
            type: "number",
            message: "数字で入力してください",
            min: 8,
            max: 8,
            message: "8桁数",
          },
        ],
        company: [
          {
            required: true,
            message: "社名を選択してください",
            trigger: "change",
          },
        ],
        desc: [{ message: "備考を入力してください" }],
      },
      rules2: {
        name: [
          {
            required: true,
            message: "氏名を入力してください",
          },
        ],
        months: [
          {
            required: true,
            message: "見積番号の日付を入力してください",
          },
          {
            type: "number",
            message: "数字で入力してください",
          },
        ],
        basic: [
          {
            required: true,
            message: "基本金額を入力してください",
          },
        ],
        upper_limit: [
          {
            required: true,
            message: "基準時間（上限）を入力してください",
          },
          {
            type: "number",
            message: "数字で入力してください",
          },
        ],
        lower_limit: [
          {
            required: true,
            message: "基準時間（下限）を入力してください",
          },
          {
            type: "number",
            message: "数字で入力してください",
          },
        ],
        start: [{ required: true, message: "作業開始日付を選択してください" }],
      },
      tableData: [],
    };
  },
  methods: {
    handleAdd() {
      this.modalType = 0;
      this.dialogVisible = true;
    },
    //ダイアログを閉じたら、入力したデータをリセット
    handleClose() {
      this.$refs.employeeForm.resetFields();
      this.dialogVisible = false;
    },
    cancel() {
      this.handleClose();
    },
  },
};
</script>

<style lang="less" scoped>
.system {
  height: 95%;
  .title {
    width: 48%;
    text-align: center;
    align-items: center;
    margin: auto;
    margin-top: 10px;
  }
  .info {
    width: 85%;
    text-align: center;
    align-items: center;
    margin: auto;
    margin-top: 10px;
  }
  .employee {
    margin-top: 40px;
    margin-left: 50px;
    .employee-table {
      width: 95%;
      margin-top: 40px;
    }
  }
}
</style>
